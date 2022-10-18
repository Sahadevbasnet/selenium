package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorNew {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
	


	
//	above
		By username = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		driver.findElement(username).sendKeys("standard_user");
	
//	Below
		By password = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	
//Right of
//	By rightof = RelativeLocator.with(By.tagName("div")).toRightOf(By.partialLinkText("Backpack"));
		
//	driver.findElement(rightof).click();

//left of
//		By leftof = RelativeLocator.with(By.tagName("div")).toLeftOf(By.partialLinkText("Bike"));
		
//		driver.findElement(leftof).click();		

		
		//near

//		By near = RelativeLocator.with(By.tagName("div")).near(By.cssSelector("#inventory_container > div > div:nth-child(2) > div.inventory_item_description > div.pricebar > div"));
//		driver.findElement(near).click();

		List<WebElement> Web = driver.findElements(By.cssSelector("#item_4_img_link > img"));
		System.out.println(Web.size());
		
		
	}
}

