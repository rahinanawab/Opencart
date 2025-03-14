package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage
{
	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//div[@id='cart']")
	WebElement btnItems;

	@FindBy(xpath="//strong[normalize-space()='View Cart']")
	//@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	WebElement lnkViewCart;

	//@FindBy(xpath="//tfoot[@id='checkout-total']//td[@class='text-end'][normalize-space()='$123.20']")
	@FindBy(xpath="//*[@id='content']/div[2]/div/table//strong[text()='Total:']//following::td")
	WebElement lblTotalPrice;  //$244.40

	//@FindBy(xpath="//a[text()='Checkout']")
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnCheckout;

	public void clickItemsToNavigateToCart()
	{
		btnItems.click();
	}

	public void clickViewCart()
	{
		lnkViewCart.click();
	}

	public String getTotalPrice()
	{
		return lblTotalPrice.getText();
	}

	public void clickOnCheckout()
	{
		btnCheckout.click();
	}
}
