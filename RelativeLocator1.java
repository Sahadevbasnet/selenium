package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator1 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		// https://www.selenium.dev/documentation/webdriver/elements/locators/
		// <h1 id = "one" class = "two" name = "nm">Heading<h1> // webelement
		
		
		// visiting a page
	// driver.get("https://www.saucedemo.com/");
		
		
			
		
//Above
	 
	 //	By username = RelativeLocator.with(By.tagName("input")).above(By.id("password"));	
	 //	driver.findElement(username).sendKeys("standard_user");
	 

//Below

//	By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
//	driver.findElement(password).sendKeys("secret_sauce");
		
		
	
	driver.get("https://www.facebook.com/");
	
	
	//above
	
	By login = RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
	driver.findElement(login).sendKeys("b_sahadev@hotmail.com");
	
	
	//Below
	By password = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
	driver.findElement(password).sendKeys("Sonu.123$");
	
	}
}
