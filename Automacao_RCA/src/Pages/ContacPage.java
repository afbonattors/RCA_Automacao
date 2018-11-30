package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BaseTest;

public class ContacPage extends BaseTest {
	
	public static WebElement divHeadquarters() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[1]/div[1]"));
		
	}
	
	public static WebElement divBranchOffice() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[2]/div[1]"));
		
	}
	
	public static WebElement divSubsidiary() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[1]/div[2]"));
		
	}
	
	public static WebElement divOffices() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[2]/div[2]"));
		
	}
	
	public static WebElement divAffiliates() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[2]/div[2]"));
		
	}
	
	public static WebElement divCareers() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"products\"]/div[2]/div[1]/div[4]"));
		
	}

}