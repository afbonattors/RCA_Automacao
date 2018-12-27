package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.FinancialPage;
import Scripts.FinancialScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class FinancialTest extends BaseTest {

	@Test
	public void financeTest() throws Exception {
		
		System.out.println("Teste Financie Page\n");	
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		FinancialScript.clickFinancial();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(FinancialPage.divHighlights().isDisplayed());
		
		Assert.assertTrue(FinancialPage.divTable().isDisplayed());
		
		Assert.assertTrue(FinancialPage.divTotalClient().isDisplayed());
		
		Assert.assertTrue(FinancialPage.divTotalEquity().isDisplayed());
		
		ScriptFooter.testFooter();
		
		Thread.sleep(1000);
		
	}

}