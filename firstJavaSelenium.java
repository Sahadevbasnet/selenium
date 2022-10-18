package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstJavaSelenium {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://demoqa.com/automation-practice-form");
		
		//Locate by Title
		
	//	System.out.println(driver.getTitle());
		//driver.quit();
		
	//Locate bye ID attribute

//driver.findElement(By.id("firstName")). sendKeys("Sahadev");
//driver.findElement(By.id("firstName")).clear();

//driver.findElement(By.id("lastName")). sendKeys("Basnet");

//Thread.sleep(2000);

//driver.findElement(By.id("gender-radio-1")).click();

// Locate by Attribute
//driver.findElement(By.name("gender"));

//Locate the element by className

//driver.findElement(By.className("Practice-form-wrapper"));
		
		
		//Program 2
		// Locate by partial LinkText
	driver.get("https://webdriveruniversity.com/");
	
	driver.findElement(By.partialLinkText("CONTACT US"));
	
	//closing the browser
	
		driver.quit();
		
		
		// we have done // locate by ID attribute, by className, by partial Link text 
	}
}
