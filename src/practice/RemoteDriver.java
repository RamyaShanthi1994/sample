package practice;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RemoteDriver {
	
	@Test (priority = 1)
	public void openBrowser() throws Exception
	{
// 		DesiredCapabilities des=new DesiredCapabilities();
// 		des.setBrowserName("chrome");
// 		des.setPlatform(Platform.WINDOWS);
		
// 		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), des);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}
