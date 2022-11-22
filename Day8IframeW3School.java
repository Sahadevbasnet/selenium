package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day8IframeW3School {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

	WebElement w3 = driver.findElement(By.cssSelector("iframe[id=\"iframeResult\"]"));
	driver.switchTo().frame(w3);
	
	driver.findElement(By.cssSelector("button[onclick=\"myFunction()\"]")).click();
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	//*[@id="mainContent"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[4]/a
	

	}
}
