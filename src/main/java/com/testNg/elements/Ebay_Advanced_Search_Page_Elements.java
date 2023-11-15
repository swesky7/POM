package com.testNg.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Advanced_Search_Page_Elements {

	WebDriver driver;
	
	@FindBy(css="button[data-marko$='{\"onclick\":\"handleClick s0-1-17-11 false\",\"onkeydown\":\"handleKeydown s0-1-17-11 false\",\"onfocus\":\"handleFocus s0-1-17-11 false\",\"onblur\":\"handleBlur s0-1-17-11 false\"}']") public WebElement advSearchBtn;
	
	@FindBy(id="gh-la") public WebElement ebayLogo;
	
	@FindBy(xpath="//input[@id='_nkw']") public WebElement keywordsField;
	
	@FindBy(css="select#e1-1>option") public List<WebElement> allCatSelectBoxOptions;
	
	public Ebay_Advanced_Search_Page_Elements(WebDriver driver) {// whatever driver passed by user , it will intialise this driver
		this.driver = driver;
		PageFactory.initElements(driver, this); // constructor which will initialize all the elements wrt driver
	}

}
