package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage 
{
WebDriver driver;
	
	//https://the-internet.herokuapp.com/basic_auth
	public BrokenImagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/broken_images']")
	WebElement BrokenImagesLink;

	public void gotoBrokenImagesPage()
	{
		BrokenImagesLink.click();
	}
}
