package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdDayCommand {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/login/");
		
		//driver.findElement(By.id("email")).sendKeys("sahadevbasnet1005@gmail.com");
		
//		
//		// https://www.selenium.dev/documentation/webdriver/elements/locators/
//		// <h1 id = "one" class = "two" name = "nm">Heading<h1> // webelement
//		
//	
//		
//		// visiting a page

	driver.get("https://www.saucedemo.com/");

		// get title
	
	//System.out.println(driver.getTitle());
	
//	String Title = driver.getTitle();
//	System.out.println(Title);
//	
//	// close all tabs
//
	driver.quit();
//	
//	//manage maximize 
//	driver.manage().window().maximize();
//	
////manage minimize
//	
//	driver.manage().window().maximize();
//	
//// close tab
//	
//	driver.close();
//
////Current Title
	
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	

		

		
		
	}
}
