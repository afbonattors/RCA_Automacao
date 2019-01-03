package Test;

import org.junit.Assert;
import org.junit.Test;

import Scripts.AnnualReportScript;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class AnnualReportTest extends BaseTest {

	@Test
	public void AnnualTest() throws Exception {
		
		System.out.println("Teste Annual Report\n");
		
		String pageTitle = getDriver().getTitle();
		
		Assert.assertEquals(pageTitle, "Safra National Bank");
		
		Thread.sleep(1000);
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		
		
	}

}