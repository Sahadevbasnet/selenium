package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropFile {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		
	//fileInputStream
		
		FileInputStream input = new FileInputStream("/Users/sahadevbasnet/eclipse-workspace/Selenium4/src/day1/testdata.properties");
		property.load(input);
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("baseurl"));
		
		
//		System.setProperty("webDriver.Chrome.Driver", 
//			"/Users/sahadevbasnet/Desktop/selljar/chromedriver");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get(property.getProperty("baseurl"));
//		System.out.println(property.getProperty("baseurl"));

	// FileOutputStream
		
		FileOutputStream out = new FileOutputStream("/Users/sahadevbasnet/eclipse-workspace/Selenium4/src/day1/testdata.properties");
		property.setProperty("State","North Carolina");
		property.store(out, "Storing the State");
	
	
	
	
	
	
	}

}
