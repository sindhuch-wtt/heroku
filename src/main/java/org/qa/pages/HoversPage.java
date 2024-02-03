package org.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage 
{
	WebDriver driver;
    public HoversPage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='/hovers']")
	WebElement HoversPage;
	
	@FindBy(xpath="//img[@alt='User Avatar']")
	List<WebElement> images;
	
	@FindBy(css="//h5()1")
	WebElement name1;
	
	@FindBy(css="a[href='/hovers']")
	WebElement viewprofile1;
	
	@FindBy(xpath="//h5")
	List<WebElement> name;
	
	@FindBy(xpath="//a[text()='View profile']")
	List<WebElement> viewprofile;
	
	public void gotoHoversPage()
	{
		HoversPage.click();
	}
	
	public void hover1()
	{
		
	}
	public void Hoverlist()
	{
		for(WebElement ele:images)
		 {
		   Actions act= new Actions(driver);
		   act.moveToElement(ele);
		    for(WebElement ele1:name)
		      {
		        System.out.println(ele1.getText());
		      }
	      	for(WebElement ele2: viewprofile)
		      {
	         	System.out.println(ele2.getText());	
	       	  }
		}
	}

}
