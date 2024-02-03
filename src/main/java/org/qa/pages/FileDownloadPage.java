package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage 
{
	WebDriver driver;
    public FileDownloadPage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/download']")
	WebElement gotodownloadpage;
	
	@FindBy(xpath="//div[@id='hot-spot']")
	WebElement contextMenu;
	
	public void gotoDownloadPage()
	{
		gotodownloadpage.click();
	}
	
	public void rightclick()
	{
		Actions act= new Actions(driver);
		act.contextClick().build().perform();		
	}
}
