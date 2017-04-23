package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReddieHWassignmentTESTCASE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.get("http://newtours.demoaut.com/");

driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Virat");

WebElement element2 = driver.findElement(By.name("lastName"));
element2.sendKeys("Kohli");

WebElement element3 = driver.findElement(By.name("phone"));
element3.sendKeys("85858585858");

WebElement element4 = driver.findElement(By.name("address1"));
element4.sendKeys("300 W Side Dr");

WebElement element5 = driver.findElement(By.name("city"));
element5.sendKeys("Gaithersburg");

WebElement element6 = driver.findElement(By.name("state"));
element6.sendKeys("Maryland");

WebElement element7 = driver.findElement(By.name("postalCode"));
element7.sendKeys("90292");

WebElement element8 = driver.findElement(By.name("email"));
element8.sendKeys("Virat.kohli@gmail.com");

WebElement element9 = driver.findElement(By.name("password"));
element9.sendKeys("mercury");

WebElement element10 = driver.findElement(By.name("confirmPassword"));
element10.sendKeys("mercury");

WebElement element11 = driver.findElement(By.name("register"));
element11.click();
driver.getPageSource().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered");
		
{System.out.println("element 9");}



	}

}
