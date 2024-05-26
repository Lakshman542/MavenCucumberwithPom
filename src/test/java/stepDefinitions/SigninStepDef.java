package stepDefinitions;

import org.junit.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;

import extentReports.ExtentTestManager;
import io.cucumber.java.en.Then;
import pages.SignInPage;
import util.BasePage;

public class SigninStepDef extends BasePage {
	
	//private WebDriver driver;
	private SignInPage signInPage;
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		signInPage = new SignInPage(driver);
		//signInPage.email.sendKeys(username);
		//signInPage.password.sendKeys(password);
		elementUtils.sendKeys(signInPage.email, username);
		elementUtils.sendKeys(signInPage.password, password);
		//String base64Screenshot = ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
		//ExtentTestManager.getTest().pass( "Entered US and PW",ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
		ExtentTestManager.getTest().pass("Entered US and PW", MediaEntityBuilder.createScreenCaptureFromPath(elementUtils.getScreeshotPath(driver)).build());
		Thread.sleep(2000);
	}

	
	@Then("^user click on login$")
	public void user_enters_username_and_password() throws InterruptedException {
		try {
		signInPage = new SignInPage(driver);
		//signInPage.email.sendKeys(username);
		//signInPage.password.sendKeys(password);
		elementUtils.click(signInPage.login);
		//String base64Screenshot = ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
		//ExtentTestManager.getTest().pass( "Entered US and PW",ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
		ExtentTestManager.getTest().pass("clicked on Login", MediaEntityBuilder.createScreenCaptureFromPath(elementUtils.getScreeshotPath(driver)).build());
		Thread.sleep(2000);
		}catch(Throwable e) {
			ExtentTestManager.getTest().fail("clicked on Login"+e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(elementUtils.getScreeshotPath(driver)).build());
			Assert.fail("not clicked on Login");
		}
	}
}
