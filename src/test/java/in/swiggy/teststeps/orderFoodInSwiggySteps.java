package in.swiggy.teststeps;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderFoodInSwiggySteps extends Driver {

	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
	   
	}

	@When("he enters Hyderabad in the delivery location")
	public void he_enters_hyderabad_in_the_delivery_location() {
		landingPage.enterDeliveryLocation("Hyderabad");
	}

	@When("he selects the 1st option from the auto-complete box")
	public void he_selects_the_1st_option_from_the_auto_complete_box() {
	    landingPage.selectFirstOptionFromAutofill();
	}

	@When("he clicks on the first restaurant shown under Top restaurants chain in Hyderabad")
	public void he_clicks_on_the_first_restaurant_shown_under_top_restaurants_chain_in_hyderabad() {
	    landingPage.clickOnFirstTopRestaurantChain();
	}

	@When("he clicks on Add button corresponds to first listed dish")
	public void he_clicks_on_add_button_corresponds_to_first_listed_dish() {
	   restaurantsPage.clickAddButton();
	}

	@When("he hovers over the Cart on the top right corner")
	public void he_hovers_over_the_cart_on_the_top_right_corner() {
		restaurantsPage.hoverOverCart();
	}

	@When("he clicks on Checkout button in the sub-menu")
	public void he_clicks_on_checkout_button_in_the_sub_menu() {
		restaurantsPage.clickCheckoutBtn();
	}

	@Then("he verify the text - {string} is displayed")
	public void he_verify_the_text_is_displayed(String string) {
	    String expectedText = "To place your order now, log in to your existing account or sign up.";
	    String actualText = checkoutPage.getSignInText();
	    Assert.assertEquals(actualText, expectedText);
	}
}
