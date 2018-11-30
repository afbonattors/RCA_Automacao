package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Utils.BaseTest;

public class ProductsPage extends BaseTest {
	
	public static WebElement divProducts() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]"));
		
	}
	
	public static WebElement divTreasury() {
		
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[1]"));
		
	}
	
	public static WebElement divInternational() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[2]"));
		
	}

}