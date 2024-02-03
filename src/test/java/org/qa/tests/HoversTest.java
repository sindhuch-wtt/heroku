package org.qa.tests;

import org.qa.pages.HoversPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest
{

	@Test
	public void Hovers()
	{
		HoversPage HoversPage=new HoversPage(driver);
		HoversPage.gotoHoversPage();
	}
}
