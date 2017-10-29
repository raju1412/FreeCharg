package Common;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

public class common 
{
	
	/* This function is created for Launching browser
	 * 
	 * Author : Raju Bhandge
	 * 
	 * 
	 * */
	public static void Launch_Browser()
	{
		String Driver_Path = "F:\\selenium jars\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver_Path);
		driver.driver = new ChromeDriver();

	}
	public static void Get_App()
	{ 
		driver.driver.get("https://www.freecharge.in");
		HomePage.Handelpopup().click();
	}
	public static void New_Registration()
	{
		HomePage.Click_On_Registration().click();
		HomePage.Click_On_register().click();
	}

	public static void Eelectricity_Click()
	{
		HomePage.Click_On_Eectricity().click();
	}
	public static void Landline_Click()
	{
		HomePage.Click_On_Landline().click();
	}
	public static void Broadband_Click()
	{
		HomePage.Click_On_Broadband().click();
	}
	public static void Gas_Click()
	{
		HomePage.Click_On_Gas().click();
	}
	public static void Water_Click()
	{
		HomePage.Click_On_Water().click();
	}
	public static void Metro_Click()
	{
		HomePage.Click_On_Metro().click();
	}
	public static void GooglePlay_Click()
	{
		HomePage.Click_On_GooglePlay().click();
	}
	public static void Handlepopup()
	{
		HomePage.Handelpopup().click();
	}


	public static void Mobile_click() 
	{
		HomePage.Click_on_Mobile().click();
	}

}
