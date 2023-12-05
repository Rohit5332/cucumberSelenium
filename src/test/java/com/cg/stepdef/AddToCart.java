package com.cg.stepdef;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class AddToCart extends BaseClass {

	WebElement element;

	public AddToCart() {
		super();
	}

	@Given("User is on the Amazon.in homepage")
	public void user_is_on_the_amazon_in_homepage() throws Exception {
		navigateToHomePage();
	}

	@When("User searches for iPhone")
	public void user_searches_for_i_phone() {
		element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("i phone");
		element.sendKeys(Keys.ENTER);
	}

	@When("User selects the first search result")
	public void user_selects_the_first_search_result() {
		String targetHref = "/sspa/click?ie=UTF8&spc=MTo4MDQ4MjgyODk4MTgxNzAzOjE3MDE3NjgyMzc6c3BfYXRmOjIwMDMwOTI2MTUwNzk4OjowOjo&url=%2FApple-iPhone-13-128GB-Blue%2Fdp%2FB09G9BL5CP%2Fref%3Dsr_1_1_sspa%3Fcrid%3D27L3LYKVF3QZZ%26keywords%3Diphone%26qid%3D1701768237%26sprefix%3Diphone%252Caps%252C252%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1";
		driver.findElement(By.xpath("//a[@href='" + targetHref + "']"));

	}

	@Then("User adds the selected item to the cart")
	public void user_adds_the_selected_item_to_the_cart() {
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		driver.findElement(By.id("add-to-cart-button"));
	}

}
