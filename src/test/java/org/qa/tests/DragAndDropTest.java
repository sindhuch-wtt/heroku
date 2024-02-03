package org.qa.tests;

import org.qa.pages.DragAndDropPage;
import org.qa.utils.BaseTest;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest
{
	@Test
	public void DragAndDropTest()
	{
		DragAndDropPage DragAndDropPage=new DragAndDropPage(driver);
		DragAndDropPage.gotoDragAnadDrop();
		DragAndDropPage.DragandDrop();
	}	
}
