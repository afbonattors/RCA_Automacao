package Scripts;

import org.junit.Assert;

import Pages.FooterClass;

public class ScriptFooter extends FooterClass {
	
	public static void testFooter() {
		
		Assert.assertTrue(divFooter().isDisplayed());

	}

}