package GridSetupTestNt.GridSetupTestNt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {

		//Define DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("chrome");
		
		//Chrome Options
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		//Create a driver object to use it in Hub
		String hubUrl = "http://192.168.1.76:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
