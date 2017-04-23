package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuickStrikeExamIIIPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 80; 
		if (score >=90)
		{
			System.out.println("You receive an A");
		}
		
		else if (score>=80)
		{
			System.out.println("You receive a B");
		}
		
		else
		{
			System.out.println("You failed");
		}
		
		
	int i = 50; 
	while (i>49)
	{
		i = i+1;
		
	}
	
	System.out.println("the temperature is moderate");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.usps.com/");
		System.out.println(driver.getTitle());
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=0c5fc98ea5900e8f4994b3fae551bdd5");
		driver.findElement(By.name("firstName")).sendKeys("Test");
		
		
		
		
		
	}

}
