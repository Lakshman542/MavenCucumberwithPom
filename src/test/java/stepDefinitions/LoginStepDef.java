package stepDefinitions;

import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;

import extentReports.ExtentTestManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticePage;
import util.BasePage;

public class LoginStepDef extends BasePage {

	// private WebDriver driver;
	private PracticePage practicePage;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		ExtentTestManager.startTest(this.getClass().getSimpleName(), "Login check");
		driver = initializeDriver();
	}

	@When("^title of login page is Practice Page$")
	public void title_of_login_page_is_free_CRM()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Practice Page", title);
		// Take base64Screenshot screenshot for extent reports
		//String base64Screenshot = "data:image/png;base64,"+ ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
		//ExtentTestManager.getTest().pass( "Title verified",ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
		ExtentTestManager.getTest().pass("Title verified", MediaEntityBuilder.createScreenCaptureFromPath(elementUtils.getScreeshotPath(driver)).build());
	}

	@Then("^user clicks on SignIn button$")
	public void user_clicks_on_login_button() {
		practicePage = new PracticePage(driver);
		// WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Sign In']"));
		// WebElement loginBtn =practicePage.loginButton;
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();",loginBtn );
		// practicePage.loginButton.click();
		elementUtils.click(practicePage.loginButton);
		//String base64Screenshot1 = "data:image/png;base64,"+ ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
		//ExtentTestManager.getTest().pass( "clicked on Sign In",ExtentTestManager.getTest().addScreenCaptureFromBase64String(base64Screenshot1).getModel().getMedia().get(0));
		ExtentTestManager.getTest().pass("Sign In", MediaEntityBuilder.createScreenCaptureFromPath(elementUtils.getScreeshotPath(driver)).build());
	}

	// Reg Exp:
	// 1. \"([^\"]*)\"
	// 2. \"(.*)\"

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}