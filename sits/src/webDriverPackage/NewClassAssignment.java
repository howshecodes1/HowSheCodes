package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Launch Web Browser
		WebDriver driver = new FirefoxDriver();

//Navigate to google.com
		driver.get("https://www.google.com/");
		
//Enter Herndon, VA and click search
		driver.findElement(By.name("q")).sendKeys("Herndon VA weather");

//Click search button
		driver.findElement(By.name("btnK")).click();
		
	}

}
