package day1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7Alerts {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
//driver.findElement(By.id("button1")).click();
//driver.switchTo().alert().accept();


//driver.findElement(By.id("button2")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("button[class=\"btn btn-default\"]")).click();



//driver.findElement(By.id("button4")).click();
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();

driver.findElement(By.id("button3")).click();
Thread.sleep(10000);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//div[@id=\"myDiv\"]/span/p")).click();

	
	}
}
