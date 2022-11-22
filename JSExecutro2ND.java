package day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class JSExecutro2ND {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");

//		System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
	
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
	driver.manage().window().maximize();
	
	WebElement a = driver.findElement(By.id("iframeResult"));
	
	driver.switchTo().frame(a);	
	
//	driver.findElement(By.cssSelector("body > button")).click();
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
//	System.out.println(driver.getTitle());
	
	
		String script = "return document.title;";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		System.out.println(je.executeScript(script));
		
		
		je.executeScript("myFunction()");
		driver.switchTo().alert().accept();
		// Highlight element

		
		WebElement e = driver.findElement(By.cssSelector("body > button"));
		je.executeScript("arguments[0].style.border = '20px solid green' ", e);

		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement e3 = driver.findElement(By.cssSelector("#main > div.w3-row.w3-padding-64.ws-black > div > div:nth-child(5) > div > a"));
		je.executeScript("arguments[0].scrollIntoView(true);" , e3);
		
			
		
	}
}
	    
		
		
		