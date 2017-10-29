package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC006_click_on_Landline 
{
	@Test
	public void ClickonLandlineOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		
		common.Landline_Click();
	}

}
