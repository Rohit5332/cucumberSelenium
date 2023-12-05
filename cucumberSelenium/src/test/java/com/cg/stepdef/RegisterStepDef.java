package com.cg.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import io.cucumber.java.en.*;

public class RegisterStepDef extends BaseClass {

	WebDriverWait wait;

	@BeforeTest
	public void setUpBeforeTest() {
		System.out.println("beforetest runs here");
	}

	public RegisterStepDef() {
		super();
	}

	@Given("user is on Registration page")
	public void user_is_on_registration_page() throws Exception {
		navigateToHomePage();
		// driver.get("https://www.amazon.in");
//		Thread.sleep(9000);
//		wait = new WebDriverWait(driver, null);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
	}

	@When("user select Hello Sign in")
	public void user_select_hello_sign_in() {
		driver.findElement(By.id("nav-link-accountList")).click();

	}

	@When("user click on Create your Amazon Account")
	public void user_click_on_create_your_amazon_account() {
		driver.findElement(By.id("createAccountSubmit")).click();
	}

	@Then("User fill the Details and Submit")
	public void user_fill_the_details_and_submit() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rohit Upadhyay");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7550169063");
		driver.findElement(By.id("ap_email")).sendKeys("upadhyayhimanshu155@gmail.com");
		driver.findElement(By.xpath(
				"//input[@class ='a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation']"))
				.sendKeys("test312");
		driver.findElement(By.className("a-button-input")).click();


	}

}
