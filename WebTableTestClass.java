package com.selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTestClass {

	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");     
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        List  rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")); 
        System.out.println("No of rows are : " + rows.size());
        //System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[3]")).getText());
        
        List<WebElement> companyName = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
        
        for(WebElement tmp: companyName){
        	System.out.println(tmp.getText());
        	if(tmp.getText().equals("Jet Airways")){
        		
        	}
        }
    
        driver.findElement(By.linkText("Forgotten account?")).click();
//        driver.findElement(By.cssSelector("input.inputtext[tabindex=1]")).sendKeys("userName");
        
	}
}
