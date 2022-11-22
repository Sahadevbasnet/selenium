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

public class BuingCreditCard2 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//Create account and login
driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
driver.findElement(By.id("customer-first-name")).sendKeys("Sahadev");
driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Basnet");
driver.findElement(By.id("customer-email")).sendKeys("As1d11@gmail.com");
driver.findElement(By.id("customer-password")).sendKeys("Sonu.123$");
driver.findElement(By.cssSelector("#login-section > form > button")).click();

driver.findElement(By.xpath("(//input[@class=\"default-input\"])[2]")).sendKeys("9195864055");

driver.findElement(By.id("pink-button")).click();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

//Shopping


//driver.findElement(By.xpath("(//a[@class=\"_tab\"])[2]")).click();
//Thread.sleep(5000);
//driver.findElement(By.cssSelector("button[class=\"absolute top-2 right-2\"]")).click();
//
//driver.findElement(By.xpath("(//a[@href=\"/collections/whats-new\"])[1]")).click();
//Thread.sleep(5000);
//driver.findElement(By.xpath("(//a[@href=\"/products/velvet-duvet-cover\"])[1]")).click();

//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//Thread.sleep(5000);
//driver.findElement(By.cssSelector("label[for=\"10-Size-King\"]")).click();
//driver.findElement(By.cssSelector("button[class=\"button relative button--primary w-full lg:flex-grow h-7 sm:h-auto rounded button--regular\"]")).click();
//driver.findElement(By.xpath("(//img[@class=\"w-full h-full object-cover\"])[1]")).click();
//driver.findElement(By.xpath("//label[@for=\"10-Size-King\"]")).click();


//driver.findElement(By.cssSelector("input[id=\"filter-sizes-S\"]")).click();



















//Set<String> windows=driver.getWindowHandles();
//int count=windows.size();
//System.out.println("Total windows opend is "+count);
//
//ArrayList<String> window=new ArrayList<String>(windows);
//		driver.switchTo().window(window.get(1));
//
//driver.findElement(By.xpath("/html/body/div[5]/div/div/div/button/svg")).click();

//Alert alertbox = driver.switchTo().alert();
//alertbox.dismiss();










//driver.switchTo().alert().accept();


//driver.findElement(By.id("button2")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("button[class=\"btn btn-default\"]")).click();



//driver.findElement(By.id("button4")).click();
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
//
//driver.findElement(By.id("button3")).click();
//Thread.sleep(10000);
////driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.findElement(By.xpath("//div[@id=\"myDiv\"]/span/p")).click();

	
	}
}
