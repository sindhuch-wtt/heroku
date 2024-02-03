package org.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOMPage 
{
WebDriver driver;
	
	//https://the-internet.herokuapp.com/basic_auth
	public ChallengingDOMPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/challenging_dom']")
	WebElement ChallengingDOMPageLink;
	
	@FindBy(xpath="//a[@href='#edit']")
	List<WebElement> EditAction;

	public void gotoChallengingDOMPage()
	{
		ChallengingDOMPageLink.click();
	}
	
	public List<WebElement> EditElements()
	{
		return EditAction;		
	}
}
