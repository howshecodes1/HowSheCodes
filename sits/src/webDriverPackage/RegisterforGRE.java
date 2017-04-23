package webDriverPackage;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterforGRE {

	public static void main(String[] args) {
		//Open web drivers
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.ets.org/gre/revised_general/register/");
		driver.findElement(By.linkText("ETS account")).click();
		driver.findElement(By.linkText("Create or Log In to Your ETS Account Now")).click();
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("personalInfo-Username")).sendKeys("Lisa");
		driver.findElement(By.id("personalInfo-middleName")).sendKeys("J");
		driver.findElement(By.id("personalInfo-lastName")).sendKeys("Tester");
		driver.findElement(By.id("socialSecurity")).sendKeys("963-852-7456");
		driver.findElement(By.id("personalInfo-email")).sendKeys("testemail@yahoo.com");
		driver.findElement(By.id("personalInfo-dateOfBirthMonth")).sendKeys("4");
	
	
		
		
	}

}
