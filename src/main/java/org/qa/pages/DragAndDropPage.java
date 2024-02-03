package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage 
{
	WebDriver driver;
	public DragAndDropPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="a[href='/drag_and_drop']")
	WebElement DragAnadDropPage;
	
	@FindBy(css="div[id='column-a']")
	WebElement source;
	
	@FindBy(css="div[id='column-b']")
	WebElement target;
	
	public void gotoDragAnadDrop()
	{
		DragAnadDropPage.click();
	}
	
	public void DragandDrop()
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
}
