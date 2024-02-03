package org.qa.tests;

import org.qa.utils.BaseTest;
import org.testng.annotations.Test;
import org.qa.pages.ContextMenuPage;

public class ContextClickAndAlert extends BaseTest
{
	@Test
	public void ContextClickAndAlert()
	{
		ContextMenuPage cmp= new ContextMenuPage(driver);
		cmp.gotoContextMenuPage();
		cmp.rightclick();
	}
	
}
