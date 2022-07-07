package kissanYardBaseClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class KisanWebBaseClass {
	public static WebDriver driver;
	protected static ExtentTest graphicalTest;
	static ExtentReports graphicalReport;

	// @SuppressWarnings("deprecation")
	@BeforeSuite
	public void beforesuite() {
		System.setProperty("webdriver.gecko.driver", "E:\\AUTOMATIONtOOLS\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.kisaanyard.com/tradehome");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		graphicalReport = new ExtentReports("C:/Users/Virendra/Desktop/KisanYard_ProjectTestReport.html", true);

	}

	@BeforeMethod
	public void beforeEachTest(Method testMethod) {
		graphicalTest = graphicalReport.startTest(testMethod.getName());
	}

	@AfterMethod
	public void afterEachTest() {
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();

	}

	@AfterTest
	public void afterSuite() {
		driver.quit();

	}

	public static String screenCapture(WebDriver driver) throws IOException {

		TakesScreenshot takeSS = (TakesScreenshot) driver;

		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/facebook.png");
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/fullPage.png"));
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}

}
