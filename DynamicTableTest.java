package com.selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/materials/Selenium/DynamicTable.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		List<WebElement> rowsElement = driver.findElements(By.xpath("//table//tr"));
		for(WebElement columns: rowsElement){
			List<WebElement> columnElements = columns.findElements(By.xpath("//td"));
			for(WebElement tmp: columnElements){
				System.out.println(tmp.getText());
			}
		}
	}
}
