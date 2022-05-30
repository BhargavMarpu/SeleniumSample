package com.selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommandsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Sample Text");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Page load time out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'sample text')]/b[contains(text(),'messages')]")));
		
		
//		WebElement temp = driver.findElement(By.xpath("//span[contains(text(),'sample text')]/b[contains(text(),'messages')]")));
		driver.findElement(By.xpath("//span[contains(text(),'sample text')]/b[contains(text(),'messages')]")).click();

	}

}
