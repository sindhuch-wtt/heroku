package org.qa.tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.qa.pages.BrokenImagesPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {
	

	@Test
	public void BrokenImagesTest() throws IOException
	{
		BrokenImagesPage BrokenImagesPage= new BrokenImagesPage(driver);
		BrokenImagesPage.gotoBrokenImagesPage();		
		List<WebElement> links = driver.findElements(By.tagName("img"));
        int brokenImagesCount=0;
        for (int i = 0; i < links.size(); i++) {
           // System.out.println(links.get(i));
            String linkURL=links.get(i).getAttribute("src");
            System.out.println(links.get(i).getText());
            URL url = new URL(linkURL);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            //http.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            http.setConnectTimeout(10000);
            http.setReadTimeout(20000);
            int statusCode=http.getResponseCode();
            if(statusCode==404||statusCode==500){
                brokenImagesCount=brokenImagesCount+1;
                System.out.println(linkURL+"and its Status codes is:"+statusCode);
            }
        }
        System.out.println("total number of broken images are: "+brokenImagesCount);
	}
}
