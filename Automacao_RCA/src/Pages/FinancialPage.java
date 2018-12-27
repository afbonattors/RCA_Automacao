package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class FinancialPage extends BaseTest {
	
	public static WebElement divHighlights() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"financial\"]/div[2]/div[1]"));
		
	}
	
	public static WebElement divTable() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"financial\"]/div[2]/table"));
		
	}
	
	public static WebElement divTotalClient() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"financial\"]/div[2]/div[2]"));
		
	}
	
	public static WebElement divTotalEquity() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"financial\"]/div[2]/div[3]"));
		
	}

}