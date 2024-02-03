package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{	
	WebDriver driver;
	public WelcomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Basic Auth\"]")
	WebElement BasicAuth;	
	
	public void gotoHomePage()
	   {
	    driver.get("https://the-internet.herokuapp.com/");	
	   }
	
}
