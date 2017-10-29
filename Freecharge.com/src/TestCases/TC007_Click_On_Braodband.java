package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC007_Click_On_Braodband 
{
	@Test
	public void ClickonBroadbandOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		common.Broadband_Click();
	}

}
