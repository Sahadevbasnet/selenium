package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuingCreditCard3 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//Create account and login
//driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
//driver.findElement(By.id("customer-first-name")).sendKeys("Sahadev");
//driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Basnet");
//driver.findElement(By.id("customer-email")).sendKeys("1sahadev1@gmail.com");
//driver.findElement(By.id("customer-password")).sendKeys("Sonu.123$");
//driver.findElement(By.cssSelector("#login-section > form > button")).click();
//
//driver.findElement(By.xpath("(//input[@class=\"default-input\"])[2]")).sendKeys("9195864055");
//
//driver.findElement(By.id("pink-button")).click();
//
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

	
driver.get("https://qatest.commentsoldrt.com/account");

	}
}
