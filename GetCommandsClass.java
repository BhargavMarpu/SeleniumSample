package com.selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommandsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		
		System.out.println("Page Title - "+driver.getTitle());
		System.out.println("Current url - "+driver.getCurrentUrl());
		System.out.println("Current url - "+driver.getPageSource());
		
	}

}
