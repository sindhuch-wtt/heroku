package org.qa.tests;

import org.qa.utils.BaseTest;
import org.testng.annotations.Test;
import org.qa.pages.AddRemoveButtonsPage;
import org.qa.pages.WelcomePage;

public class AddRemoveButtons extends BaseTest
{	
	@Test
	public void AddRemoveButtonsTest()
	{
	AddRemoveButtonsPage AddRemoveButtonsPage= new AddRemoveButtonsPage(driver);
	AddRemoveButtonsPage.gotoAddRemoveButtonsPage();
	AddRemoveButtonsPage.clickOnAddButton();
	AddRemoveButtonsPage.clickOnDeleteButton();
	}
}
