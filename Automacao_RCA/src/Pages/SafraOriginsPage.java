package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class SafraOriginsPage extends BaseTest {
	
	public static WebElement divDescription() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"about\"]/div[2]"));
		
	}

}