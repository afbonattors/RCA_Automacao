package Test;

import org.junit.Assert;
import org.junit.Test;

import Pages.ProductsPage;
import Scripts.ProductsScript;
import Scripts.ScriptFooter;
import Scripts.ScriptHeader;
import Utils.BaseTest;

public class ProductsTest extends BaseTest {

	@Test
	public void productsTest() throws Exception {
		
		System.out.println("About Page Test\n");	
		
		String PageTitle = getDriver().getTitle();
		
		Assert.assertTrue(PageTitle.equals("Safra National Bank"));
		
		ScriptHeader.testHeader();
		
		Thread.sleep(1000);
		
		ProductsScript.menuProducts();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(ProductsPage.divProducts().isDisplayed());
		
		Assert.assertTrue(ProductsPage.divTreasury().isDisplayed());
		
		Assert.assertTrue(ProductsPage.divInternational().isDisplayed());
		
		ScriptFooter.testFooter();
		
		Thread.sleep(1000);
		
	}

}