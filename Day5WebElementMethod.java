package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5WebElementMethod {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
	//driver.get("http://automationpractice.com/index.php");
		
			
	
//SendKeys and search by Specific item
			
			//driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
			//driver.findElement(By.cssSelector("button[name=\"submit_search\"]")).click();
			
				
			// driver.findElement(By.id("search_query_top")).sendKeys("Printed Dress");
			// driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

			
//getSize
			//System.out.println(driver.findElement(By.cssSelector("img[title=\"Blouse\"]")).getSize());


			
//	Clear()
			//	driver.findElement(By.id("search_query_top")).clear();
	
		
	
		
//get attribute
		
			//String getattribute = driver.findElement(By.cssSelector("input[name=\"search_query\"]")).getAttribute("placeholder");
			//System.out.println(getattribute);


//get text
			//String gettext = driver.findElement(By.cssSelector("a[title=\"Contact Us\"]")).getText();
			//System.out.println(gettext);
			
//get Tagname
			//String Tagname = driver.findElement(By.cssSelector("[title=\"Contact Us\"]")).getTagName();
			//System.out.println(Tagname);


		
		driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");		
	
//	
// isDisplayed()
//			boolean disp = driver.findElement(By.cssSelector("span[class=\"category-name\"]")).isDisplayed();
//			System.out.println(disp);
//			
//
// Enabled
		//	boolean enable = driver.findElement(By.cssSelector("span[class=\"category-name\"]")).isEnabled();
		//	System.out.println(enable);

		
// isSelected
			driver.findElement(By.cssSelector("input[id=\"layered_id_attribute_group_1\"]")).click();
			boolean select = driver.findElement(By.cssSelector("input[id=\"layered_id_attribute_group_1\"]")).isSelected();
			System.out.println(select);

			
//getLocation
			

			System.out.println(driver.findElement(By.cssSelector("span[class=\"category-name\"]")).getLocation());
			

// getCssValue()

			String getCss = driver.findElement(By.tagName("h1")).getCssValue("color");
			System.out.println(getCss);
			
	}

}
