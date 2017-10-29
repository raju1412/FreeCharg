package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC0011_Click_On_GooglePaly 
{
	@Test
	public void ClickonGoogleOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		
		common.GooglePlay_Click();
	}

}
