package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8Iframe {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("http://www.webdriveruniversity.com/IFrame/index.html");

	WebElement Iframe = driver.findElement(By.cssSelector("iframe[id=\"frame\"]"));	
	driver.switchTo().frame(Iframe);
	
	driver.findElement(By.cssSelector("a[href=\"index.html\"]")).click();
	System.out.println(driver.getTitle());
	driver.switchTo().parentFrame();
	
	}
}
