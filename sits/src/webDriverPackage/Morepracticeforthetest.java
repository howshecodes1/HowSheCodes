package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Morepracticeforthetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int number1;
			number1 = 1000; 
			System.out.println(number1);
		}
		
		{
			String name;
			name = "Disney World";
			String name2;
			name2 = "SWEET VACATION";
			int xy;
			xy = 800;
			int zz;
			zz = 500;
			System.out.println(name+" " +name2+" "+(xy+zz));
		}
		
		{
			int score = 25;
			if (score >=90)
				
			{
				System.out.println("you passed");
			}
					
			else if (score >=80)
			{
				System.out.println("you failed");
			}
			else if (score >=70)
			{
				System.out.println("you failed worse");
			}
			else
			{
				System.out.println("it's done");
			}
		}
		
		
		{
		WebDriver driver = new FirefoxDriver();
		{
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys("IsThisWorking");
			System.out.println(driver.getTitle());
		}
		}
		
		{
			int woah;
			woah = 122;
			
			double wow;
			wow = 12.2; 
			
			String x = "Hello world";
			char abxy = 'H';
			
					System.out.println((woah + wow)+ " " +x+" "+abxy);
		}
		
		{
			int i = 90; 
			
			while (i >= 90)
				
			{
				i = i+1;
				
			} System.out.println("thats it");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
