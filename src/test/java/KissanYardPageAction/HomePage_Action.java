package KissanYardPageAction;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import KissanYardLocator.HomePage_Locators;
import kissanYardBaseClass.KisanWebBaseClass;

public class HomePage_Action extends KisanWebBaseClass {

	public WebDriver driver;

	HomePage_Locators homePL = null;

	public HomePage_Action(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		homePL = new HomePage_Locators(driver);

	}

	public void checkLogo() throws IOException {
		if (homePL.getlogo() != null)

			graphicalTest.log(LogStatus.PASS, " Logo is present,test pass");
		else {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver)) + " Logo not is present,Test Failed");
			Assert.assertFalse(true);
		}
	}

	public void clickLogin() throws IOException {

		homePL.getlogin().click();
		System.out.println(driver.getCurrentUrl());
		String title = driver.getCurrentUrl();
		if (title.equals("https://www.kisaanyard.com/user-logi"))
			graphicalTest.log(LogStatus.PASS, " Login page open,test pass");
		else {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver)) + "Login page not open ,Test Failed");
			Assert.assertFalse(true);
		}
	}

	public void clickRegister() throws IOException {
		driver.navigate().back();
		homePL.getregister().click();
		String RTitle = driver.getCurrentUrl();
		if (RTitle.equals("https://www.kisaanyard.com/user-registration"))
			graphicalTest.log(LogStatus.PASS, " Register page open,test pass");
		else {
			graphicalTest.log(LogStatus.FAIL, graphicalTest.addScreenCapture(screenCapture(driver)) + "Register page not open,Test Failed");
			Assert.assertFalse(true);
		}

	}

}
