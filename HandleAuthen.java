package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthen {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream input = new FileInputStream("/Users/sahadevbasnet/eclipse-workspace/Selenium4/src/day1/testdata.properties");
		property.load(input);
		
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		//System.out.println(username);
		//System.out.println(password);
		
		System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
				ChromeDriver driver = new ChromeDriver();
			
			//	driver.get("https://the-internet.herokuapp.com/basic_auth");
			//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		 
	
		
	
	
	
	
	
	}

}
