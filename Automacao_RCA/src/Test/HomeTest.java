package Test;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import Pages.HomePage;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class HomeTest extends BaseTest {

	@Test
	public void homeTest() throws Exception {
		
		System.out.println("Teste HomePage\n");
		
		getDriver().navigate().to(Safra);
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(HomePage.imageHome().isDisplayed());
		
		Assert.assertTrue(HomePage.divProducts().isDisplayed());
		
		Assert.assertTrue(HomePage.divFinancialHighlights().isDisplayed());
		
		Assert.assertTrue(HomePage.divAboutSafra().isDisplayed());
		
		ScriptFooter.testHeader();
		
	}

}