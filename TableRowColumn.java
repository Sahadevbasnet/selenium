package day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class TableRowColumn {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
	
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		
		// Get the number of rows
		
		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rowElements.size());
		int rowsize = rowElements.size();
		
			
				// Get the total numbers of columns
		List<WebElement> colElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(colElements.size());
		int colsize = colElements.size();
	
		//Get the total numbers of tables
		List<WebElement> tableElements = driver.findElements(By.xpath("//*[table]"));
		System.out.println(tableElements.size());
		int tablesize = tableElements.size();
		
		
		// Iterate rows and columns and print the text of column
		for (int i=2; i<=rowsize; i++) {
			for(int t=1; t<=colsize; t++) {
					
//		String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[" + t + "]")).getText();
//		System.out.println(text);
			}
		
	    		}
//Sum
		
		int sum = 0;
		for (int i = 2; i<=rowsize; i++) {
			
		String text = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + i + "]/td[3]")).getText();
		System.out.println(text);
		sum = sum + Integer.parseInt(text);
		}
		
		System.out.println(sum);
		System.out.println(sum / (rowsize - 1));

	
		
		
	}
}
		
		
		
		
		