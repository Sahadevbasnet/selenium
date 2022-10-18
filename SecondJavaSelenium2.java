package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondJavaSelenium2 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("sahadevbasnet1005@gmail.com");
		
//		
//		// https://www.selenium.dev/documentation/webdriver/elements/locators/
//		// <h1 id = "one" class = "two" name = "nm">Heading<h1> // webelement
//		
//	
//		
//		// visiting a page
//	// driver.get("https://www.saucedemo.com/");
//		
//		
//		
//		
//		
////		<input class="input_error form_input" placeholder="Username" type="text" data-test="username" 
////				id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
//
//		
////Locate by ID
//		
//	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		
//		
////Locate by Name
//		
//	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
//
////Locate by ClassName
//	//	driver.findElement(By.className("input_error")).sendKeys("standard_user");
//		
////Locate by tagName
////		driver.findElement(By.tagName("input")).sendKeys("standard_user");
//		
//
////css locator
////		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//
//
//// xpath absolute and relative
//		
//// driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		
//	
//	
////Link Text
//
//		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
////		driver.findElement(By.linkText("Overview")).click();
//
////Partial Link Text
//		
//		driver.findElement(By.partialLinkText("Started")).click();
//		
	}
}
