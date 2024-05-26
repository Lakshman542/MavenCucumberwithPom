package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {

	private WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void click(WebElement element) {
		element.click();
	}

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public String getScreeshotPath(WebDriver driver){
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String path = System.getProperty("user.dir")+"/Screenshot/image"+date+".png";
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
		
	}
}
