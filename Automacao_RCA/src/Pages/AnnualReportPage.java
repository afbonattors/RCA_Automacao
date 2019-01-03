package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class AnnualReportPage extends BaseTest {
	
	public static WebElement pdfAnnual() {
		
		return BaseTest.getDriver().findElement(By.linkText("Annual_Report_2017_SNBNY"));
		
	}	

}