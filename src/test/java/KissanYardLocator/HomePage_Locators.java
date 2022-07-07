package KissanYardLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Locators {
	public WebDriver driver;

	public HomePage_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='ky_logo img-fluid']")
	private WebElement logo;

	public WebElement getlogo() {
		return logo;

	}

	@FindBy(xpath = "//*[@class='animated-button1 login']")

	private WebElement login;

	public WebElement getlogin() {
		return login;
	}

	@FindBy(xpath = "//a[@href='user-registration']")
	private WebElement register;

	public WebElement getregister() {
		return register;
	}
}
