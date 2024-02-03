package org.qa.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qa.pages.WelcomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
    String browser;
    
	public WebDriver initializedriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\qa\\libs\\qa.properties");
		prop.load(fis);
		String browsername= prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
		}				
		driver.manage().window().maximize();
	    driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   
	    return driver;
	}
		
	public WelcomePage launchApplication() throws IOException
	{
		 driver = initializedriver();
		 WelcomePage WelcomePage=new WelcomePage(driver);
		 WelcomePage.gotoHomePage();
	     return WelcomePage;	
	}
	
    @BeforeMethod
     public void beforemethod() throws IOException
     {
	 launchApplication();	 
     }
 
     @AfterMethod
     public void AfterMethod() 
     { 
     }
 
     public void waitForElementsToAppear(By findBy)
	 {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	 }
     
     public String getScreenshot(String testCaseName) throws IOException
     {
    	 TakesScreenshot TakesScreenshot= (TakesScreenshot) driver;
    	 File source=TakesScreenshot.getScreenshotAs(OutputType.FILE);
    	 File dest= new File(System.getProperty("user.dir")+"//screenshots"+testCaseName+".png");
    	 FileUtils.copyFile(source, dest);
    	 return System.getProperty("user.dir")+"//screenshots"+testCaseName+".png";
     }
}
