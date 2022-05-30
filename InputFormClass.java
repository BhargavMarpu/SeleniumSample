package com.selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		
		System.out.println("Page Title - "+driver.getTitle());
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Address Filed Entered");
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropDown.selectByIndex(0);
		Thread.sleep(2000);
		dropDown.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		
		
		
	}

}
