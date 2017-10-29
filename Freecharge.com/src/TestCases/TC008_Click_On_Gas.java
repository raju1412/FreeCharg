package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC008_Click_On_Gas 
{
	@Test
	public void ClickonGasOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		common.Gas_Click();
	}

}
