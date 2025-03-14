package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//h2[normalize-space()='My Account']") //MyAccount Page Heading
    //@FindBy(xpath="//h1[normalize-space()='My Account']")
    WebElement msgHeading;
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")

    WebElement lnkLogout;

    public boolean isMyAccountPageExists(){
        try {
            return (msgHeading.isDisplayed());
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", lnkLogout);

        //lnkLogout.click();
    }
}
