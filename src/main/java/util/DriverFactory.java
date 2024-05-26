package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

	public WebDriver driver;

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "/Users/Lakshman/Downloads/chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
		} else if (browser.equals("edge")) {
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;

	}

}
