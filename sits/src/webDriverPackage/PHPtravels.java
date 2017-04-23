package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHPtravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Open browser
		WebDriver driver = new FirefoxDriver();

//Navigate to PHP travel
		driver.get("http://phptravels.net/");
		driver.manage().window().maximize();

//Click on My Account (By Xpath)
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		
//Signup link (By Xpath)
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();

// Enter First name, Last name, Mobile number, Email, Password and Confirm password
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[3]/input")).sendKeys("Test");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[4]/input")).sendKeys("TestLN");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[5]/input")).sendKeys("741.963.8529");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("trailblaze14@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("newpassword");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("newpassword");
		

//Click on Sign up button
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		Thread.sleep(2000);
		
//Click on Signout Button		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		driver.close();
		
		
		
		
		
	}

}
