package org.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.qa.pages.DropdownPage;
import org.qa.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest{
	
	@Test
	public void DropdownTest() 
	{
		DropdownPage DropdownPage= new DropdownPage(driver);
		DropdownPage.gotoDropdownPage();
		Select selectobj= new Select(driver.findElement(By.id("dropdown")));
		List<WebElement> dropdownlist=selectobj.getOptions();
		for(int i=0;i<dropdownlist.size();i++)
		{
			String dropdownText= dropdownlist.get(i).getText();
			System.out.println(dropdownlist.get(i).getText());	
			if(dropdownText.equalsIgnoreCase("Option 1"))
			{
				selectobj.selectByVisibleText("Option 1");
			}
		}	
		String Actvalue= selectobj.getFirstSelectedOption().getText();
		System.out.println(Actvalue);	
		Assert.assertEquals(Actvalue, "Option 1", "Test failed");
	}
}
