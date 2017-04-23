package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Creditcardregistration {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Open creditKarma website
		driver.get("https://www.creditkarma.com/");
				
		driver.manage().window().maximize();
		
		//Click on the "Get Your Free Scores" link
		driver.findElement(By.linkText("Get your free scores")).click();
		
		//Enter e-mail address
		driver.findElement(By.id("email")).sendKeys("thisisatest@yahoo.com");
		
		//Re-confirm email address
		driver.findElement(By.id("retypeemail")).sendKeys("thisisatest@yahoo.com");
		
		//Create password
		driver.findElement(By.id("password")).sendKeys("TestPassword1");
		
		//Confirm Password
		driver.findElement(By.id("retypepw")).sendKeys("TestPassword1");

		//Security Questions
		driver.findElement(By.xpath(".//*[@id='secqcode']/option[2]"));
			
		driver.findElement(By.id("secqans")).sendKeys("Monkey");
		driver.findElement(By.linkText("submit")).click();
	}

}
