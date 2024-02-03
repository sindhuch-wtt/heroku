package org.qa.tests;
import java.io.IOException;
import java.util.Properties;
import org.qa.pages.BasicAuthPage;
import org.qa.pages.WelcomePage;
import org.qa.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest{
	@Test
	public void BasicAuthTest() throws IOException	
	{
	BasicAuthPage BasicAuthPage= new BasicAuthPage(driver);	
	 BasicAuthPage.gotoBasicAuthPage();
	 BasicAuthPage.LoginBasicAuth();
	 String ActualText= BasicAuthPage.LoginBasicAuth();
	 Assert.assertEquals(ActualText, "Congratulations! You must have the credentials.", "Incorrect text,test failed");
	}
}
