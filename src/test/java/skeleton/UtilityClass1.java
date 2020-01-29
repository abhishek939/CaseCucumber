package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class UtilityClass1 {
	WebDriver driver;
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "src/test/java/Resourse/chromedriver.exe");
		    return new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/java/Resource/geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Internet Explorer"))
		{
			System.setProperty("webdriver.ie.driver", "src/test/java/Resource/IEDriverServer.exe");
			return new InternetExplorerDriver();

		}
		else
		{
			return null;
		}
	}
}