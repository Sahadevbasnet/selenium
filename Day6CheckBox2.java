package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		// TODO Auto-generated method stub
		//System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Arrangement
	driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	//http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
	
	//Action
	WebElement firstCheck = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
	firstCheck.click();
	
// Assertion
	if(firstCheck.isSelected()) {
		System.out.println("first Checkbox is selected");
	}
	else {
		System.out.println("Check box is not selected");
	}


// selecting all the check box
	List<WebElement> Checks = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
for (int i = 0; i < Checks.size(); i++) {
	System.out.println(i);
	if(!Checks.get(i).isSelected()) {
	Checks.get(i).click();
	}
}	
	
	}

}
