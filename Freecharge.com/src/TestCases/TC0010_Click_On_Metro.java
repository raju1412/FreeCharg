package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC0010_Click_On_Metro 
{
	@Test
	public void ClickonMetroOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		
		common.Metro_Click();
	}

}
