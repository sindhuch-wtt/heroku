package org.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage 
{
	WebDriver driver;
    public FramesPage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/frames']")
	WebElement gotoFramesPage;
	
	@FindBy(css="a[href='/iframe']")
	WebElement gotoiFrame;
	
	@FindBy(css="a[href='/nested_frames']")
	WebElement gotonestedFrames;
		
	public void gotoFramesPage()
	{
		gotoFramesPage.click();
	}
	
	public void gotoiFrame()
	{
		gotoiFrame.click();
	}
	
	public void gotoNestedFrames()
	{
		gotonestedFrames.click();
	}
	
	public void NestedFrames()
	{
driver.switchTo().frame("frame-top");

driver.switchTo().frame("frame-left");
System.out.println(driver.findElement(By.tagName("body")).getText());
driver.switchTo().parentFrame();

driver.switchTo().frame("frame-middle");
System.out.println(driver.findElement(By.xpath("//div['text()=MIDDLE']")).getText());
driver.switchTo().parentFrame();

driver.switchTo().frame("frame-right");
System.out.println(driver.findElement(By.tagName("body")).getText());
driver.switchTo().defaultContent();

driver.switchTo().frame("frame-bottom");
System.out.println(driver.findElement(By.tagName("body")).getText());
driver.switchTo().defaultContent();

}
	
	public void Frames()
	{
		driver.switchTo().frame("mce_0_ifr");	
		driver.findElement(By.id("tinymce")).sendKeys("Hi");
		driver.switchTo().defaultContent();
	}
	

}
