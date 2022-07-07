package KisanYardPageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import KissanYardPageAction.HomePage_Action;
import kissanYardBaseClass.KisanWebBaseClass;

public class HomePage_Tests extends KisanWebBaseClass {

	@Test
	public void HomePageTc1() throws IOException {
		HomePage_Action homePA = new HomePage_Action(driver);

		// homePA.Home_Page_Action();
		homePA.checkLogo();
		// graphicalTest.log(LogStatus.PASS, " page is open,test pass");
	}

	@Test
	public void HomePageTc2() throws IOException {
		HomePage_Action homePA = new HomePage_Action(driver);

		homePA.clickLogin();
	}

	@Test
	public void HomePageTc3() throws IOException {
		HomePage_Action homePA = new HomePage_Action(driver);

		homePA.clickRegister();
	}
}