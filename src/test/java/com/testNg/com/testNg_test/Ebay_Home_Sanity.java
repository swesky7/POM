package com.testNg.com.testNg_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.testng.Assert;

public class Ebay_Home_Sanity extends AbstractBaseTest {

	@Test
	public void empty_search_test() throws Exception {
		
		App().Flow().navigateToUrl("https://www.ebay.com/");
		
		Thread.sleep(2000);

		String expectedURL = "https://www.ebay.com/n/all-categories?_from=R40&_trksid=p2380057.m570.l1313&_nkw=&_sacat=0";
		String expectedTitle = "Shop by Category | eBay";

		Assert.assertTrue(App().Pages().HomePage().isSearchButtonEnabled(), "Verify Search Button Enabled");

		App().Pages().HomePage().clickSearchButton();
		Thread.sleep(2000);
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		System.out.println(newUrl);
		System.out.println(newTitle);

		Assert.assertEquals(newUrl, expectedURL, "Verify URL of the new page");
		Assert.assertEquals(newTitle, expectedTitle, "Verify Title of the new page");

	}

	/*
	 * @Test public void empty_search_test_softassert() throws Exception {
	 * 
	 * 
	 * App().Flow().navigateToUrl("https://www.ebay.com/"); Thread.sleep(2000);
	 * 
	 * SoftAssert sa = new SoftAssert();
	 * 
	 * String expectedURL =
	 * "https://www.ebay.com/n/all-categories?_from=R40&_trksid=p2380057.m570.l1313&_nkw=&_sacat=0";
	 * String expectedTitle = "Shop by Category | eBay";
	 * 
	 * sa.assertTrue(App().Pages().HomePage().isSearchButtonEnabled(),
	 * "Verify Search Button Enabled");
	 * 
	 * App().Pages().HomePage().clickSearchButton(); Thread.sleep(2000); String
	 * newUrl = App().Flow().getCurrentPageUrl(); String newTitle =
	 * App().Flow().getCurrentPageTitle(); System.out.println(newUrl);
	 * System.out.println(newTitle);
	 * 
	 * sa.assertEquals(newUrl, expectedURL, "Verify URL of the new page");
	 * sa.assertEquals(newTitle, expectedTitle, "Verify Title of the new page");
	 * 
	 * sa.assertAll(); }
	 */
}