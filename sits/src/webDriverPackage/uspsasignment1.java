package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uspsasignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open browser
		WebDriver driver = new FirefoxDriver();
		//navigatge to usps
		driver.get("https://www.usps.com/welcome.htm");
		
		
		//click on tools
		
		driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
	}

}
