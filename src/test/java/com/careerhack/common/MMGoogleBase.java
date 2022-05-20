package com.careerhack.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMGoogleBase {
	
	public WebDriver driver; //driver declared -variable
	
	public void launchBrowser() {
		
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}  

	public void closeBrowser() {
		
		driver.close();
	}
	
}
