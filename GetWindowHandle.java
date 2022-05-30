package com.selenium.methods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\materials\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
        String handle= driver.getWindowHandle();
        System.out.println(handle);

        driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
        for (String windowHandle : driver.getWindowHandles()) {
        	if(windowHandle!=handle)
        		driver.switchTo().window(windowHandle);
         }
        //Closes only current window
        driver.close();
        // Closes All Browser windows initated by driver session
        driver.quit();
	}

}
