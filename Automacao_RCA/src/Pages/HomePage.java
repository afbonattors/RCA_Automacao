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
	
	public static WebElement divAbout() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]"));
		
	}
	
	public static WebElement divClickAbout() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[2]"));
		
	}
	
	public static WebElement divOrigins() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[1]"));
		
	}

}