package Scripts;

import org.junit.Assert;

import Pages.HeaderClass;

public class ScriptHeader extends HeaderClass {
	
	public static void testHeader() {
		
		Assert.assertTrue(headerHome().isDisplayed());
		Assert.assertTrue(headerImage().isDisplayed());
		Assert.assertTrue(headerAbout().isDisplayed());
		Assert.assertTrue(headerProducts().isDisplayed());
		Assert.assertTrue(headerFinancial().isDisplayed());
		Assert.assertTrue(headerReport().isDisplayed());
		Assert.assertTrue(headerContact().isDisplayed());
		Assert.assertTrue(headerLogin().isDisplayed());
		
	}

}
