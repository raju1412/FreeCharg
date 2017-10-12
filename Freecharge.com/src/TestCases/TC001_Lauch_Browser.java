package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Common.common;



public class TC001_Lauch_Browser 
{
	@BeforeMethod
	public static void Launch_Browser()
	{
		common.Launch_Browser();
	}
	@Test
	public static void Get_App()
	{
		common.Get_App();
		common.New_Registration();
	}
//
}
