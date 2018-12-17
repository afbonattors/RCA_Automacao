package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class AboutSafraPage extends BaseTest {
	
	public static WebElement clickAbout() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/ul/li[1]"));
		
	}
	
	public static WebElement divDescription() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"about\"]/div[2]"));
		
	}

}