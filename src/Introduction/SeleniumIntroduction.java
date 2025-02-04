package Introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//Chrome -> ChromeDriver -> Methods (will help to automate in this browser)
		//create objects to the class to access the methods present in the class
		// methods name should be same throughout the browsers
		//WebDriver is the Interface , group of related methods with empty bodies
		//class responsibility to implements the methods present in WebDriver
		//Interface will enforces the contract to class to follow those methods
		//WebDriver methods + Internal class methods
		// driver object here has access to the methods of ChromeDriver which are defined in Web Driver Interface
		// Invoke the chromedriver // selenium manager - check 
		
		System.setProperty("WebDriver.chrome.driver", "/C:/Users/Goodluck/OneDrive/Documents/ChromeDriverchromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
