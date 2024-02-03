package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage 
{
	WebDriver driver;
    public ContextMenuPage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/context_menu']")
	WebElement contextMenuPage;
	
	@FindBy(xpath="//div[@id='hot-spot']")
	WebElement contextMenu;
	
	public void gotoContextMenuPage()
	{
		contextMenuPage.click();
	}
	
	public void rightclick()
	{
		Actions act= new Actions(driver);
		act.contextClick().build().perform();		
	}
	
}
