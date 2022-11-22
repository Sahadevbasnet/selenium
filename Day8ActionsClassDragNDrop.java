package day1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day8ActionsClassDragNDrop {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		// create object of the class
		Actions b = new Actions (driver);
		WebElement w = driver.findElement(By.id("double-click"));
		b.doubleClick(w).perform();
	
		
		
	//Drag and Drop
				
		//act.dragAndDrop(From, To).build().perform();
		
		WebElement From = driver.findElement(By.id("draggable"));
		
		WebElement TO = driver.findElement(By.id("droppable"));
		b.dragAndDrop(From,TO).build().perform();
		
		// Arrangement , action , assertion
		// Click and Hold()
		
	WebElement e2 = driver.findElement(By.cssSelector("#click-box"));
		b.moveToElement(e2);
		b.clickAndHold().perform();
//		
//		
//		// Context click
	//	WebElement e3 = driver.findElement(By.cssSelector("#double-click"));
	//	b.contextClick(e3).perform();
//		
//		
//		
//
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//				
//		
//		//  Javascript
//		// element created , element update , element delete , element retrive
//		// attribute of element --> retrive , update , delete , added
//		
//		
//		
//		
//		
//		
//		
		
		

}

}

