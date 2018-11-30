package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class HeaderClass extends BaseTest {
	
	public static WebElement headerHome() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"header\"]"));
		
	}
	
	public static WebElement headerImage() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"header\"]/div/h1/a"));
		
	}
	
	public static WebElement headerAbout() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]"));
		
	}
	
	public static WebElement headerProducts() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]"));
		
	}
	
	public static WebElement headerFinancial() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]"));
		
	}
	
	public static WebElement headerReport() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]"));
		
	}
	
	public static WebElement headerContact() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]"));
		
	}
	
	public static WebElement headerLogin() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]"));
	}

}