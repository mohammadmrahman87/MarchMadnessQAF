package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.careerhack.common.MMGoogleBase;
import com.careerhack.pages.MMGoogleHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MM_GoogleSearch extends MMGoogleBase{
	MMGoogleHomePage hp;
	
	

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
	}

	@When("I entered the search {string}")
	public void i_entered_the_search(String string) {
		// step 1:identify the web element
		//8 locators to identify an element
		//id,name,class,html tag,linkText,partial link text,css selector,xpath
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		// perform an operation
		//searchBox.sendKeys(string);
		
		MMGoogleHomePage hp= new MMGoogleHomePage(driver);
		
	   hp.enterSearch(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement searchButton;
		//searchButton=driver.findElement(By.name("btnk"));
		//searchButton.click();
	    
		MMGoogleHomePage hp = new MMGoogleHomePage(driver);
		hp.clickSearch();
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement result = driver.findElement(By.id("result-stats"));
		String nResult = result.getText();
		System.out.println("*************");
		System.out.println(nResult);
		System.out.println("*************");
		
		closeBrowser();
		
	   
	}


}
