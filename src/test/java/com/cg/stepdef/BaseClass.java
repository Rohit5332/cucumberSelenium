package com.cg.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;

	public BaseClass() {
		this.driver = new ChromeDriver();
	}

	/**
	 * Uses Thread.sleep in case if any popup occur.
	 * 
	 * @throws Exception
	 */
	public void navigateToHomePage() throws Exception {
		driver.get("https://www.amazon.in");
		Thread.sleep(9000);
	}

	public WebDriver getDriver() {
		return driver;
	}
}