package Test;

import org.junit.Assert;
import org.junit.Test;

import Scripts.AnnualReportScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class AnnualReportTest extends BaseTest {

	@Test
	public void AnnualTest() throws Exception {
		
		System.out.println("Teste Annual Report\n");
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertEquals(PageTitle, "Safra National Bank");
		
		Thread.sleep(1000);
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		ScriptFooter.testFooter();
		
		AnnualReportScript.clickAnnualReport();
		
		Thread.sleep(10000);
		
		String pdfAnnual = driver.getCurrentUrl();
		
		Assert.assertTrue(pdfAnnual.contains(".pdf"));		
		
	}

}