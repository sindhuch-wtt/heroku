package org.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
WebDriver driver;
	
	//https://the-internet.herokuapp.com/basic_auth
	public CheckBoxPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/checkboxes']")
	WebElement CheckBoxlink;
	
	@FindBy(xpath="//input[@type='checkbox']")
	List<WebElement> CheckBoxes;

	public void gotoCheckBoxesPage()
	{
		CheckBoxlink.click();
	}
	
	public List<WebElement> getCheckboxes()
	{
		return CheckBoxes;
	}

}
