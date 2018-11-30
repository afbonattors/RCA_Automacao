package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class HomePage extends BaseTest {
	
	public static WebElement imageHome() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"home\"]/a/img"));
		
	}
	
	public static WebElement divProducts() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"home\"]/div[1]/div"));
		
	}
	
	public static WebElement divFinancialHighlights() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[1]"));
		
	}
	
	public static WebElement divAboutSafra() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[2]"));
		
	}

}