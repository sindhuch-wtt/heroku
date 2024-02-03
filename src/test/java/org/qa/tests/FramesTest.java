package org.qa.tests;

import org.qa.pages.DragAndDropPage;
import org.qa.pages.FramesPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest
{
	@Test
	public void DragAndDropTest()
	{
		FramesPage FramesPage=new FramesPage(driver);
		FramesPage.gotoFramesPage();		
		FramesPage.gotoiFrame();
		FramesPage.Frames();
	}	
}
