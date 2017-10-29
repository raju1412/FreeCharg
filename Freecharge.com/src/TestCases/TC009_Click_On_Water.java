package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC009_Click_On_Water 
{
	@Test
	public void ClickonWaterOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		common.Water_Click();
	}

}
