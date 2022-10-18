package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6RadioButton {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

	// Radio buttons
	
	driver.findElement(By.cssSelector("input[value=\"blue\"]")).click();
	
if(driver.findElement(By.cssSelector("input[value=\"blue\"]")).isSelected()) {
		
		System.out.println("Radio button selected");
		}
	else {	
	System.out.println("Radio button not selected");
	}

List<WebElement> RadioClick = driver.findElements(By.cssSelector("input[name=\"color\"]"));

for (int i =0; i < RadioClick.size(); i++) {
	//	System.out.println(i);
		Thread.sleep(1000);
		RadioClick.get(i).click();
		//System.out.println("Radio buttons click");
	}

	
	
	}
}
