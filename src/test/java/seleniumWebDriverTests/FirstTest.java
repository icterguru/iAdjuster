package seleniumWebDriverTests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args){
//		FirefoxProfile firefoxProfile = new FirefoxProfile();
//
//	    firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);
//	    WebDriver driver = new FirefoxDriver(firefoxProfile);
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.m0kter.wordpress.com");
	    String sTitle = driver.getTitle();
        System.out.println(sTitle);
        
        driver.get("https://www.facebook.com");
        String sTitle2 = driver.getTitle();
        System.out.println(sTitle2);
//    	WebElement textbox = driver.findElement(By.cssSelector(	"Email"));
//		textbox.sendKeys("MY LOGIN NAME");	

        System.out.println(  driver.manage().window().getSize());
        
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
  
        driver.get("http://localhost:8080/iAdjuster");
  
	//	driver.close();
		
	}
}

