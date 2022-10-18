package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class FourthDayWebElement {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/");
	String A1 = driver.findElement(By.tagName("a")).getText();
		System.out.println(A1);
		
//		WebElement login = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView():",login);
//		
//		login.click();
//		
//		WebElement login1 = driver.findElement(By.id("text"));
//				login1.sendKeys("Sahadev");

	
	
/*	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("b_sahadev@hotmail.com");
	driver.findElement(By.id("pass")).sendKeys("Sonu.123$");		
	driver.findElement(By.xpath("//button[@name='login']")).click();
	//driver.quit();
*/	
	

	/*	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
		username.sendKeys("Admin");
		
		//driver.quit();
		
		
	
		driver.get("https://www.saucedemo.com/");
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		
		
		//getText()
		
		String gettext = driver.findElement(By.tagName("h4")).getText();
		System.out.println(gettext);
		
		*/
		
	}
}


