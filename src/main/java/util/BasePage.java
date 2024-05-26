package util;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BasePage {

	private DriverFactory driverFactory;
	public static WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	public ElementUtils elementUtils = new ElementUtils(driver);

	public WebDriver initializeDriver() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();

		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);

		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		return driver;
	}
	
	public WebDriver getDriver() {
        return driver;
    }
	
}
