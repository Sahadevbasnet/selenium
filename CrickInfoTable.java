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

public class CrickInfoTable {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
	
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/swaminarayan-pro-twenty-2022-23-1342104/mafuko-mavericks-vs-play-master-warriors-14th-match-1342125/full-scorecard");
		driver.manage().window().maximize();
		
		// Get the number of rows
		

List <WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr"));
int rowsize = rowElements.size();
System.out.println(rowsize);


List <WebElement> colElements = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr[2]/td"));
int colsize = colElements.size();
System.out.println(colsize);



int sum = 0;
for (int i = 2; i<=rowsize; i++) {
	
String text =	driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr["+i+"]/td[3]")).getText();

System.out.println("_______");

System.out.println(text);
sum = sum + Integer.parseInt(text);
}

System.out.println(sum);

	}
}
		
		
		
		