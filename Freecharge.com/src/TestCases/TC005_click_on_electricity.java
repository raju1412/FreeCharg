package TestCases;

import org.testng.annotations.Test;

import Common.common;

public class TC005_click_on_electricity 
{
	@Test
	public void ClickonElectricityOnHonePage()
	{
		common.Launch_Browser();
		common.Get_App();
		
		common.Eelectricity_Click();
	}
	

}
