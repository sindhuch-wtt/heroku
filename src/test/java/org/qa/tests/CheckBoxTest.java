package org.qa.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.qa.pages.CheckBoxPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest
{
	@Test
	public void CheckBoxTest()
	{
		CheckBoxPage CheckBoxPage= new CheckBoxPage(driver);
		CheckBoxPage.gotoCheckBoxesPage();
		List<WebElement> checkboxes= CheckBoxPage.getCheckboxes();
		
		for(WebElement ele: checkboxes)
		{
			boolean isDisplayed= ele.isDisplayed();
			boolean isEnabled= ele.isEnabled();
			boolean isSelected= ele.isSelected();
			System.out.println("Is Displayed? "+ isDisplayed);
			System.out.println("Is Enabled? "+ isEnabled);
			System.out.println("Is Selected? "+ isSelected);

			if(isSelected==false)
			{
				ele.click();
			}
		}
	}
}
