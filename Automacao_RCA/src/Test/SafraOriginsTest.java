package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.SafraOriginsPage;
import Scripts.SafraOrignsScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class SafraOriginsTest extends BaseTest {
	
	@Test
	public void originsTest() throws Exception {
		
		System.out.println("Teste Origins\n");
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		ScriptFooter.testFooter();
		
		Thread.sleep(1000);
		
		SafraOrignsScript.clickAbout();
		
		Thread.sleep(1000);
		
		SafraOrignsScript.clickOrigins();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(SafraOriginsPage.divDescription().isDisplayed());		
		
	}

}