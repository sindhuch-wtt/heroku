package org.qa.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.qa.pages.ChallengingDOMPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends BaseTest{
	
	@Test
	public void ChallengingDOMTest()
	{
		ChallengingDOMPage ChallengingDOMPage= new ChallengingDOMPage(driver);
		ChallengingDOMPage.gotoChallengingDOMPage();
		List<WebElement> editelements= ChallengingDOMPage.EditElements();
		//a[@href='#edit']/preceding::td[text()='Phaedrum0'] uniquely identifying element with respect to axes
		for(int i=0;i<editelements.size();i++)
		{
			System.out.println(editelements.get(i).getText());
			
			if(editelements.get(i).getText().equalsIgnoreCase(null))
			editelements.get(i).click();
		}		
	}

}
