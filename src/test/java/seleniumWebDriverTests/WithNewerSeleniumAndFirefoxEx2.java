package seleniumWebDriverTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WithNewerSeleniumAndFirefoxEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "");
		
		// http://learn-automation.com/firefox-browser-on-mac-using-selenium-webdriver/
		// http://stackoverflow.com/questions/37785686/how-to-use-the-gecko-executable-with-selenium
		
//		System.setProperty("webdriver.gecko.driver", "/Users/Dr.Mokter/Utilities/geckodriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		//WebDriver driver = new FirefoxDriver();
		// http://stackoverflow.com/questions/38692208/how-to-use-geckodriver-in-selenium-webdriver-3-0-beta
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://www.mozilla.org");
	
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}

		driver.close();

	}
}