package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day7AllLinkOnPage {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("http://www.webdriveruniversity.com/");

List <WebElement> TotalLinks = driver.findElements(By.tagName("a"));

System.out.println("Total number of Links" + TotalLinks.size());

for (int i=0; i<TotalLinks.size();i++) {
	System.out.println(TotalLinks.get(i).getAttribute("herf"));
	System.out.println(TotalLinks.get(i).getText());
}

	
		
	
	
	}
}
