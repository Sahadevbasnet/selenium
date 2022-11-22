package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFacebook {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		FileInputStream in = new FileInputStream("/Users/sahadevbasnet/eclipse-workspace/Selenium4/src/day1/test.properties");
		property.load(in);
		
		String email = property.getProperty("email");
		String pwd = property.getProperty("password");
		//System.out.println(email);
		//System.out.println(pwd);
		
		System.setProperty("webDriver.Chrome.Driver", "/Users/sahadevbasnet/Desktop/selljar/chromedriver");
		
				ChromeDriver driver = new ChromeDriver();
				//driver.get("https://www.facebook.com/");
				//driver.get("https://b_sahadev@hotmail.com:Susan.123$@facebook.com/");
			driver.get("https://"+email+":"+pwd+"@facebook.com/");
 
	
	}

}
