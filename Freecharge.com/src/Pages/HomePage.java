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
	public static WebElement Click_On_Eectricity()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid=''.0.3.0.0.0.0:$3.0.2]"));
	}
	public static WebElement Click_On_Landline()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$4.0.1']"));
	}
	public static WebElement Click_On_Broadband()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$5.0.1']"));
	}
	public static WebElement Click_On_Gas()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$6.0.1']"));
	}
	public static WebElement Click_On_Water()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$7.0.1']"));
	}
	public static WebElement Click_On_Metro()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$8.0.1']"));
	}
	public static WebElement Click_On_GooglePlay()
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.1.0.1']"));
	}
	public static WebElement Handelpopup()
	{
		return driver.driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
	}
	public static WebElement Click_on_Mobile() 
	{
		return driver.driver.findElement(By.xpath("//span[@data-reactid='.0.3.0.0.0.0:$0.0.1' ]"));
	}
	
	

}
