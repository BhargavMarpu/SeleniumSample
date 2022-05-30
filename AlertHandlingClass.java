package com.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingClass {

	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/delete_customer.php");			

		driver.findElement(By.name("cusid")).sendKeys("53920");					
		driver.findElement(By.name("submit")).submit();			
		try{
			Alert alert = driver.switchTo().alert();		
			String alertMessage= driver.switchTo().alert().getText();		
			System.out.println(alertMessage);	
			Thread.sleep(5000);
			alert.accept();
//			alert.dismiss();
		}catch(Exception e){
			System.out.println("No Alert present!!");
		}

	}
}
