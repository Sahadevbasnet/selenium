package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdDayCommandPractice2 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//get 
		
		driver.get("https://www.facebook.com/");
		
		//quit close all tabs
		
//		driver.quit();
		
		//close one tab
		
//		driver.close();
		
		//current url
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		//Title
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//Manage
		driver.manage().window().maximize();

		

		
		
	}
}
