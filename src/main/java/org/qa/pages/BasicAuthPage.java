package org.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage
{
	WebDriver driver;
	
	//https://the-internet.herokuapp.com/basic_auth
	public BasicAuthPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=\"Basic Auth\"]")
	WebElement BasicAuth;
	
	@FindBy(xpath="//p")
	WebElement confirmtext;

	
	public void gotoBasicAuthPage()
	{
		BasicAuth.click();
	}
	public String LoginBasicAuth()throws IOException
	{
		 Properties prop= new Properties();
		 FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\qa\\libs\\qa.properties");	
		 prop.load(fis);
		 String authurl="https://"+prop.getProperty("basicauthuser")+":"+prop.getProperty("basicauthpassword")+"@"+prop.getProperty("basicauthurl");
		driver.get(authurl);	
		String ActualText= confirmtext.getText();
		return ActualText;
		
	}
}
