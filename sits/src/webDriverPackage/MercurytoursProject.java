
package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercurytoursProject {

	public static void main(String[] args) {
		// Author: 
		// Open Firefox web browser
			WebDriver driver = new FirefoxDriver();
		
		// Launch mercury website
			driver.get("http://newtours.demoaut.com/"); 
		
		//print the title of the page
			driver.getTitle(); 
		
		//Print
			System.out.println(driver.getTitle());
		 
		//Click on "Register" link (use By link text or By link)
			driver.findElement(By.linkText("REGISTER")).click();
			
		//Enter first name
			driver.findElement(By.name("firstName")).sendKeys("Anonymous");
		
		//Enter last name
			driver.findElement(By.name("lastName")).sendKeys("Very Anonymous");
		
		//Enter phone number
			driver.findElement(By.name("phone")).sendKeys("4567897412");
			
		//Enter email address
			driver.findElement (By.id("userName")).sendKeys("anonymous@yahoo.com");
		
		//Enter address
			driver.findElement(By.name("address1")).sendKeys("123 Eutopia Lane");
			
		//Enter city
			driver.findElement(By.name("city")).sendKeys("Blissland");
			
		//Enter state
			driver.findElement (By.name("state")).sendKeys("UT");
		
		//Enter zip code
			driver.findElement(By.name("postalCode")).sendKeys("96321");
			
		//Enter username
			driver.findElement(By.id("email")).sendKeys("TeamMercury");
			
		//Enter password
			driver.findElement (By.name("password")).sendKeys("BlueLagoon");
			
		//Enter password (reconfirm)
			driver.findElement(By.name("confirmPassword")).sendKeys("BlueLagoon");
			
		//Click on register
			driver.findElement(By.name("register")).click();
			driver.close();
	}
	
	

}