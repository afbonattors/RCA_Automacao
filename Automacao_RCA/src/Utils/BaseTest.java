package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;
    public static String driverPath = "C:\\Selenium\\Chrome_Driver\\chromedriver.exe";
    public static String Safra = "http://www.safra.com/";

    @BeforeClass
    public static void setUp() {
    	
    	System.out.println("\nInicia driver.\n");

    	getDriver().navigate().to(Safra);

    }

    public static WebDriver getDriver() {

        if (driver == null) {

        	ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized", "--disable-notifications");
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

        }
        
        return driver;
        
    }

    @AfterClass
    public static void tearDown(){
    	
    	System.out.println("\nFecha driver.\n");

        getDriver().quit();
        driver = null;

    }
}