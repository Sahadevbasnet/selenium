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

public class Day10JSExecutor {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");

//		System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
	
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://login.yahoo.com/?.intl=in");
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	//	js.executeScript("alert('Welcome to selenium')");
		
	//	WebElement checkbox = driver.findElement(By.id("persistent"));
	//	checkbox.click();
//	
//		Thread.sleep(3000);
	//	js.executeScript("arguments[0].click()",  checkbox);

		
//	js.executeScript("document.getElementById('persistent').click()");
		

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.manage().window().maximize();	    
	    
		WebElement a = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(a);
		
		driver.findElement(By.cssSelector("body > button")).click();
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
		
		
		
		String script = "return document.title;";
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		System.out.println(je.executeScript(script));
		
	
		
	//javascript executor way to invoke function
		je.executeScript("myFunction()");
		driver.switchTo().alert().accept();
	
		WebElement e = driver.findElement(By.cssSelector("body > button"));
		je.executeScript("arguments[0].style.border = '10px dotted green'",e);
		
	
//		// Highlight element
//		
//		WebElement e1 = driver.findElement(By.xpath("/html/body/button"));
//		je.executeScript("arguments[0].style.border='5px solid green'", e1);
//		
//		driver.navigate().to("https://www.w3schools.com/");
//		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
//		je.executeScript("arguments[0].scrollIntoView(true);", e2);
		
		
		
	}
}
	    
		
		
		