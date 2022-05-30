package com.selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowserClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\materials\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
//		driver.navigate().refresh();
//		driver.navigate().forward();
		System.out.println(driver.getTitle());
/*//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("userName");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("userName");
		driver.findElement(By.cssSelector("input.inputtext[type=password]")).sendKeys("password");
//		driver.findElement(By.cssSelector("input.inputtext[tabindex=1]")).sendKeys("userName");
*/
//		driver.findElement(By.id("inputtext")).sendKeys("akdhckls");
		
		driver.findElement(By.id("inputtext")).sendKeys("akdhckls");
		driver.findElement(By.name("email")).sendKeys("usingname");
		driver.findElement(By.cssSelector("input#email")).sendKeys("UsingCssSelector");
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		driver.findElement(By.cssSelector("input.inputtext")).clear();
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("usingcssclasss");
		
	}

}
