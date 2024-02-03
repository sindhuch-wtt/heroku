package org.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
WebDriver driver;
	
	public DropdownPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/dropdown']")
	WebElement Dropdownlink;

	
	public void gotoDropdownPage()
	{
		Dropdownlink.click();
	}
	/*
	public List<WebElement> getDropdowns()
	{
		return Dropdown;
	}*/

}
