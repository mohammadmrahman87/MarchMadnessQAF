package advanceelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {
	
	

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		chk1.click();
		
		boolean check = chk2.isSelected();
		
		if (check == true)
			System.out.println("Check box is selected");
		
		
	}

}
