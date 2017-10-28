package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.driver;

public class HomePage 
{
	static WebElement registration_Link,login_Link,register_Link;
	
	public static WebElement Click_On_Registration()
	{
		return registration_Link = driver.driver.findElement(By.xpath("//a[@data-reactid='.0.0.1.1.0.0']"));
		
	}
	public static WebElement Click_On_Login()
	{
		return login_Link = driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.1.0.0.0.0.1.0.0']"));
		
	}
	public static WebElement Click_On_register()
	{
		return register_Link = driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.1.0.0.0.0.1.0.1']"));
		
	}
	
	public static WebElement Click_on_Mobile() 
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$0.0.1' ]"));
	}
	
	

}
