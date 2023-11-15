package com.testNg.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	
	private WebDriver driver;
	private PageLib page;
	private FlowLib flow;
	
	public AppLib(WebDriver driver) {// we will initialise all page objects
		this.driver = driver;
		page = new PageLib(this.driver);
		flow = new FlowLib(this.driver);
	}
	
	public PageLib Pages() {
		return page;
	}
	
	public FlowLib Flow() {
		return flow;
	}

}
