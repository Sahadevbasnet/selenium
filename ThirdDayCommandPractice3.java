package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdDayCommandPractice3 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		
//		String current = driver.getCurrentUrl();
//		System.out.println(current);
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
		
		String text = driver.findElement(By.tagName("h4")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		//get 
		
//		driver.get("https://www.facebook.com/");
//		
//		//quit close all tabs
//		
////		driver.quit();
//		
//		//close one tab
//		
////		driver.close();
//		
//		//current url
//		
//		String Url = driver.getCurrentUrl();
//		System.out.println(Url);
//		
//		//Title
//		
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		
//		//Manage
//		driver.manage().window().maximize();
//
//		

		
		
	}
}
