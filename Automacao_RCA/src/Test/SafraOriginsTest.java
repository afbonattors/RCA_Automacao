package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.SafraOriginsPage;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class SafraOriginsTest extends BaseTest {
	
	@Test
	public void originsTest() {
		
		System.out.println("Teste Origins\n");
		String PageTitle = getDriver().getTitle();
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		ScriptHeader.testHeader();
		ScriptFooter.testFooter();
		Assert.assertTrue(SafraOriginsPage.divDescription().isDisplayed());		
		
	}

}