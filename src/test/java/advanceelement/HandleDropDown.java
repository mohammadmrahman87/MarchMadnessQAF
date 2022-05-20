package advanceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropDown =  driver.findElement(By.id("dropdown"));
		
		Select sel = new Select(dropDown);   //  select is a class
		// 1.select by index
		//2.select by value
		//3.select by visibleText
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		sel.deselectByValue("2");
	}

}
