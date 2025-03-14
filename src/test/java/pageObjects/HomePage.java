package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@title='My Account']")
	//@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	@FindBy(linkText = "Login")
	WebElement lnkLogin;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtSearchbox;
	//@FindBy(xpath="//button[@type='submit']")
	@FindBy(xpath="//div[@id='search']//button[@type='button']")
	WebElement btnSearch;

	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() {
		lnkLogin.click();
	}

	public void enterProductName(String pName) {
		txtSearchbox.sendKeys(pName);
	}

	public void clickSearch() {
		btnSearch.click();
	}
}
