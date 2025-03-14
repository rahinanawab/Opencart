package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_004_SearchProductTest extends BaseClass {

	@Test(groups= {"Master"})
	public void verify_pruductSearch() throws InterruptedException {
		logger.info(" Starting TC_004_SearchProductTest ");

		try {

			HomePage hm=new HomePage(driver);

			//hm.enterProductName("iPhone");
			//hm.enterProductName("mac");
			hm.enterProductName("HP LP3065");

			hm.clickSearch();

			SearchPage sp=new SearchPage(driver);
			sp.isProductExist("HP LP3065");

			Assert.assertEquals(sp.isProductExist("HP LP3065"),true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_004_SearchProductTest ");

	}
}
