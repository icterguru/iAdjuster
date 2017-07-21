package seleniumWebDriverTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithNewerSeleniumAndFireFox {

    /**
     * Web driver.
     */
    private static WebDriver driver = null;

    /**
     * Entry point.
     * 
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // Download "geckodriver.exe" from https://github.com/mozilla/geckodriver/releases
       // System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
    	//System.setProperty("webdriver.gecko.driver", "/Users/Dr.Mokter/Utilities/geckodriver");
    	System.setProperty("webdriver.gecko.driver", "geckodriver");
    	
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://localhost:8080/iAdjuster/");
        driver.get("https://www.google.com");
        String sTitle = driver.getTitle();
        System.out.println(sTitle);
    }

}