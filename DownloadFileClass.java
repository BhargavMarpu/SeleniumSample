package com.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileClass {


	public static void main(String args[]){
		FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("pdfjs.disabled", true );
		profile.setPreference("pdfjs.disabled", true );
		profile.setPreference("pdfjs.enabledCache.state", false );
		profile.setPreference("pdfjs.enabledCache.state", false);
		profile.setPreference("pdfjs.migrationVersion", 2);
		profile.setPreference("pdfjs.previousHandler.alwaysAskBeforeHandling", true);
		profile.setPreference("pdfjs.previousHandler.preferredAction", 4);
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.download.dir","E:\\materials\\Selenium\\Downloads\\");
		profile.setPreference("plugin.disable_full_page_plugin_for_types", "application/pdf,application/vnd.adobe.xfdf,application/vnd.fdf,application/vnd.adobe.xdp+xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv, application/octet-stream, application/pdf");
		profile.setPreference("browser.helperApps.neverAsk.openFile","text/csv,application/octet-stream, application/pdf");

		//For Selenium version greater than 3 
		/*  System.setProperty("webdriver.gecko.driver","E:\\materials\\Selenium\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions().setProfile(profile);
	    WebDriver driver = new FirefoxDriver(options);*/
		
		
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.pdf995.com/samples/");
		driver.findElement(By.linkText("pdf.pdf")).click();
	}
}
