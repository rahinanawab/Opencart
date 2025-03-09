package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountRegistrationPage extends BasePage{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtFirstname;
@FindBy(xpath="//input[@id='input-lastname']") 
WebElement txtLastname;
@FindBy(xpath="//input[@id='input-email']") 
WebElement txtEmail;
@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;
@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;
@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtConfirmPassword;
@FindBy(xpath="//input[@name='agree']")
WebElement togglePolicy;
//@FindBy(xpath="//button[normalize-space()='Continue']")
@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;
public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);
}
public void setLastName(String lname) {
	txtLastname.sendKeys(lname);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
	public void setTelephone(String tel){
	txtTelephone.sendKeys(tel);
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setConfirmPassword(String confpwd) {
	txtConfirmPassword.sendKeys(confpwd);
}
/*public void setPrivacyPolicy() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(togglePolicy));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", togglePolicy);
}*/
public void setPrivacyPolicy() {
	togglePolicy.click();
}
public void clickContinue() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//sol1 
	//btnContinue.click();

	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
}
public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
}
}
