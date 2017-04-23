package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReddiHWassignment3152017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TEST CASE #1: Search for the weather in Herndon, Va & print title of the page
		WebDriver driver = new FirefoxDriver();
				
					driver.get("http://www.google.com");
					
					driver.findElement(By.name("q")).sendKeys("Herndon Va Weather");
					driver.findElement(By.name("btnG")).click();
					
		System.out.println("The title of the page is:"+driver.getTitle());

		
		
		
	}

}
