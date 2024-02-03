package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveButtonsPage 
{

   WebDriver driver;
   public AddRemoveButtonsPage(WebDriver driver)
    {
	 this.driver=driver;
	 PageFactory.initElements(driver,this );
    }
   
   @FindBy(xpath="//a[@href='/add_remove_elements/']")
   WebElement addremovebuttons;
   
   @FindBy(xpath="//button[@onclick='addElement()']")
   WebElement addbbutton;  
   
   @FindBy(xpath="//button[@onclick='deleteElement()']")
   WebElement deletebutton;  

   public void gotoAddRemoveButtonsPage()
	{
	   addremovebuttons.click();
	}
   public void clickOnAddButton()
   {
	   addbbutton.click();
   }
   
   public void clickOnDeleteButton()
   {
	   deletebutton.click();
   }
}


