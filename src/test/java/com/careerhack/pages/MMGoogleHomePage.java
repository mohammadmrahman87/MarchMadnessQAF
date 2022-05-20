package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMGoogleHomePage {
	
	
	WebDriver driver;
	
	public MMGoogleHomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	//Page Object Model(POM)
	//is a guideline that separates the step definition and the wed elements
	//so that we can reuse the  element and action on the elements
	// two way to implement page object model
	// 1. page Factory or 2. without page factory
	
	//WebElement searchBox = driver.findElement(By.name("q")); //located
	
	@FindBy(name="q")
	WebElement searchBox;
	
	// perform an operation
	//searchBox.sendKeys(string);       
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	//WebElement searchButton;
	//searchButton=driver.findElement(By.name("btnK"));
	@FindBy(name="btnK")
	WebElement searchButton;
	
	public void clickSearch() {
		searchButton.click();
		
	}
	
	
    

}
