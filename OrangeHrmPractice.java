package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class OrangeHrmPractice {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//get 
		
//		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-234268105%3A1665779412132352&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWoR7kzv5g9C5FjvQrmgKshE2W-0_4Dqr-IOHkkRL-NxIg_CYTKZJTC5zIa7keIg0EwsBvtG");
//
//		driver.findElement(By.id("identifierId")).sendKeys("sahadevbasnet1008@gmail.com");
//		
//		driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
		
		driver.get("https://www.facebook.com/");

		
//Above
		By login = RelativeLocator.with(By.tagName("input")).above(By.id("pass"));
		driver.findElement(login).sendKeys("b_sahadev@hotmail.com");

//Below		
		By password = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
		driver.findElement(password).sendKeys("Sonu.123$");
		
		driver.findElement(By.name("login")).click();
		
//left of
		
					
//	//By find = RelativeLocator.with(By.tagName("path")).toLeftOf(By.className("x1a2a7pz x1qjc9v5 xnwf7zb x40j3uw x1s7lred x15gyhx8 x9f619 x78zum5 x1fns5xo x1n2onr6 xh8yej3 x1ba4aug xmjcpbm"));
//		driver.findElement(find).click();
				
//				//right-of
//				
//				By q3 = RelativeLocator.with(By.tagName("button")).toRightOf(By.cssSelector("input[value=\"Submit\"]"));
//				System.out.println(driver.findElement(q2).getText());
//				
//			
//				//near
//		
//				By q4 = RelativeLocator.with(By.tagName("button")).near(By.cssSelector("a[role=\"button\"]"));
//				
//				
//				
//				
//				
				
	}
}
