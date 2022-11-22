package day1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8WindowHandling {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("https://webdriveruniversity.com/");
	driver.findElement(By.id("contact-us")).click();
	
	Set<String> handle = driver.getWindowHandles();
	System.out.println(handle);
	Iterator<String> IT = handle.iterator();
	String parentTab = IT.next();
	String secondTab = IT.next();
	driver.switchTo().window(secondTab);
	
	
	
	driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Sahadev");
	driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Basnet");
	driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("sahadevbasnet1008@gmail.com");
	driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("Hello, I am learning selenium");
	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}
}
