package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.AboutSafraPage;
import Scripts.AboutScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class AboutTest extends BaseTest {

	@Test
	public void aboutTest() throws Exception {
		
		System.out.println("Test About Page\n");	
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		AboutScript.clickAbout();
		
		Thread.sleep(1000);
		
		AboutScript.clickAboutDiv();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(AboutSafraPage.divDescription().isDisplayed());
		
		Thread.sleep(1000);
		
		ScriptFooter.testFooter();
		
		Thread.sleep(1000);
		
	}

}