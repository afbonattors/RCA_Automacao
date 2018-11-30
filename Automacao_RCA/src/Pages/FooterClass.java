package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class FooterClass extends BaseTest {
	
	public static WebElement divFooter() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"footer\"]"));
		
	}

}