package com.selenium.methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileClass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement browse =driver.findElement(By.id("uploadfile"));
		browse.sendKeys("E:\\materials\\Selenium\\Downloads\\pdf.pdf");
//		driver.close();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_A);
		
	}

}
