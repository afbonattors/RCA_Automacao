package Scripts;

import Pages.HomePage;

public class AnnualReportScript extends HomePage {
	
	public static void clickAnnualReport() {
		
		divAnnualReport().click();
		
	}
	
	public static void handleWindow() {
		
		driver.switchTo().window("Annual_Report_2017_SNBNY");
		
	}

}