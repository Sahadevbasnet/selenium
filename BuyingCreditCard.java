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

public class BuyingCreditCard {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//Create account and login
//driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
//driver.findElement(By.id("customer-first-name")).sendKeys("Sahadev");
//driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Basnet");
//driver.findElement(By.id("customer-email")).sendKeys("sahade@gmail.com");
//driver.findElement(By.id("customer-password")).sendKeys("Sonu.123$");
//driver.findElement(By.cssSelector("#login-section > form > button")).click();
//
//driver.findElement(By.xpath("(//input[@class=\"default-input\"])[2]")).sendKeys("9195864055");
//
//driver.findElement(By.id("pink-button")).click();
//
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

//log in
driver.get("https://qatest.commentsoldrt.com/account");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("sahade@gmail.com");
driver.findElement(By.id("password")).sendKeys("Sonu.123$");
driver.findElement(By.cssSelector("button[class=\"ws-v2-button-primary mt-1r\"]")).click();
	
driver.findElement(By.xpath("//*[contains(text(),'Shop')]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//shopping
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
driver.findElement(By.cssSelector("[class=\"absolute top-2 right-2\"]")).click();
driver.findElement(By.xpath("(//*[contains(text(),'New Arrivals')])[1]")).click();

//Add to cart
driver.findElement(By.xpath("(//a[@class=\"text-product-card lg:text-product-card-lg max-lines-2\"])[1]")).click();
driver.findElement(By.cssSelector("[for=\"10-Size-Twin XL\"]")).click();
driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
driver.findElement(By.xpath("(//a[@tabindex=\"0\"])[3]")).click();

Thread.sleep(5000);

//Delivery address
driver.findElement(By.id("one")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//button[@class=\"_pill-button\"])[2]")).click();
Thread.sleep(4000);
driver.findElement(By.id("back")).click();

driver.findElement(By.id("back")).click();
driver.findElement(By.xpath("[(//input[@class=\'default-input\'])[3]")).click();
driver.findElement(By.xpath("[(//input[@class=\'default-input\'])[3]")).sendKeys("500 court jester");
driver.findElement(By.id("locality")).sendKeys("Cary");
driver.findElement(By.cssSelector("[name=\"state\"]")).click();

WebElement dropDown = driver.findElement(By.name("state"));

Select select = new Select(dropDown);

select.selectByValue("NC");

driver.findElement(By.name("state")).sendKeys("North Carolina");

driver.findElement(By.xpath("(//input[@class=\"default-input\"])[6]")).sendKeys("27560");
driver.findElement(By.id("save-button")).click();

//Credit card payment



driver.findElement(By.id("credit-card")).click();
WebElement ifrm = driver.findElement(By.cssSelector("[title=\"Secure card payment input frame\"]"));
WebElement Frame = driver.findElement(By.cssSelector("[name=\"__privateStripeFrame5206\"]"));
driver.switchTo().frame(ifrm);
driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
driver.findElement(By.name("exp-date")).sendKeys("05/24");
driver.findElement(By.name("cvc")).sendKeys("111");
driver.findElement(By.name("postal")).sendKeys("12345");
driver.switchTo().parentFrame();
driver.findElement(By.id("stripe-button")).click();
driver.findElement(By.xpath("//button[@class=\"_cta-button\"]")).click();
Thread.sleep(15000);

//Coupons
driver.findElement(By.xpath("(//button[@class=\"_pill-button\"])[4]")).click();
driver.findElement(By.cssSelector("[placeholder=\"Enter Code\"]")).sendKeys("5OFF20");
Thread.sleep(5000);
driver.findElement(By.id("save-button")).click();


//payment
Thread.sleep(5000);
driver.findElement(By.cssSelector("[class=\"_cta-button\"]")).click();

//Close
Thread.sleep(20000);

//driver.findElement(By.cssSelector("[class=\"webstore-checkout-btn\"]")).click();
driver.findElement(By.cssSelector("[class=\"webstore-checkout-btn\"]")).click();

//Go to Account
driver.findElement(By.xpath("//a[contains(@aria-label, 'Account')]")).click();

//Log out
driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/div[2]/section/div/div[2]/div[2]/div[6]/span")).click();


driver.quit();
	}
}
