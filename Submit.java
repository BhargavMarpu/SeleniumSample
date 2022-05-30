package com.selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Submit {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		//Scenario 1
		System.setProperty("webdriver.gecko.driver", "/home/user/Desktop/geckodriver");
		driver = new FirefoxDriver();
	}
	
	@Test
	@Parameters({"contact","emailid", "tickets"})
	public void test(String contact, String emailid, String tickets){
		//Scenario 3
		driver.get("http://localhost:8080/application/");
		//Scenario 4
		driver.findElement(By.xpath("//input[@value='Mall of Mysore']")).click();
		//Scenario 5
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='listMom']//tbody//tr"));
		for(WebElement row: rows){
			List<WebElement> columns = row.findElements(By.xpath("//td"));
			System.out.println(columns.get(0) +" and "+ columns.get(2));
		}
		//Scenario 6
		WebElement checkText = driver.findElement(By.xpath("//p[text()='Click to check which movie is running in the malls']"));
		if(checkText.getText().startsWith("Click to check"))
			System.out.println("it matches");
		else
			System.out.println("it does not match");

		//Click on events link
		driver.findElement(By.xpath("//a[@id='eventsLink']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Select checkbox Entertainment
		driver.findElement(By.xpath("//input[@value='Entertainment']")).click();
		
		//Select radio button did trails
		driver.findElement(By.xpath("//td[text()='DID Trails']/parent::tr/following-sibling::td/input")).click();
		
		//Accept the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Switch Driver
		String mainWindow= driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
        	if(windowHandle!=mainWindow)
        		driver.switchTo().window(windowHandle);
        }
		
		//Assert caluclate button
		WebElement button = driver.findElement(By.xpath("//button[text()='Calculate Cost']"));
		Assert.assertEquals(button.isEnabled(), false);
		
		//Fetch values from testng
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(contact);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='ticketNo']")).sendKeys(tickets);
		
		driver.findElement(By.xpath("//button[text()='Check Valid Data']")).click();
		
		//Click on calculate cost button
		driver.findElement(By.xpath("//button[text()='Calculate Cost']")).click();
		
		//Fetch the message
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}

}
