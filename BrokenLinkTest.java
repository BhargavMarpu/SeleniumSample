package com.selenium.methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkTest {

	public static void main(String args[]){
		WebDriver driver = null;
		String homePage = "http://www.google.com";
		String url = "";
		HttpURLConnection connection = null;
		int respCode = 200;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()){
			url = it.next().getAttribute("href");
			System.out.println(url);
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			/*if(!url.startsWith(homePage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}*/
			try {
				connection = (HttpURLConnection)(new URL(url).openConnection());
				connection.setRequestMethod("HEAD");
				connection.connect();
				respCode = connection.getResponseCode();

				if(respCode >= 400){
					System.out.println(url+" is a broken link");
				}
				else{
//					System.out.println(url+" is a valid link");
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		driver.quit();
	}
}
