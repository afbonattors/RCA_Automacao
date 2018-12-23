package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.DirectorsPage;
import Scripts.AboutScript;
import Scripts.DirectorsScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class DirectorsTest extends BaseTest {

	@Test
	public void directorsTest() throws Exception {
		
		System.out.println("About Page Test\n");	
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		AboutScript.clickAbout();
		
		Thread.sleep(1000);
		
		DirectorsScript.clickDirectorsDiv();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(DirectorsPage.divDescription().isDisplayed());
		
		Thread.sleep(1000);
		
		ScriptFooter.testFooter();
		
		Thread.sleep(1000);
		
	}

}