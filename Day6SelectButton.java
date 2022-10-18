package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6SelectButton {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
	driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
	//http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
			

//Search button
	
//	driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
//	driver.findElement(By.cssSelector("button[name=\"submit_search\"]")).click();
//	
//	WebElement search = driver.findElement(By.id("selectProductSort"));
//	// Class ---- object ---- properties and methods
//	Select search1 = new Select(search);
	
	
//Select by Index
	//search1.selectByIndex(2);

//SelectBYText
	//search1.selectByVisibleText("Reference: Lowest first");

//SelectByValue
	//search1.selectByValue("quantity:desc");

	// click on element 
	
	// testing ---- actual vs expected -----
	
	// arrangement  --- different --- local , staging , canary, production
	// action 
	// assertion
	
	
	}

}
