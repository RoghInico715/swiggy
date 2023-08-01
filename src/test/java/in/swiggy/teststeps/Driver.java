package in.swiggy.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;
import in.swiggy.pages.CheckoutPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.RestaurantsPage;

public class Driver extends Tools {

	protected static LandingPage landingPage;
	protected static RestaurantsPage restaurantsPage;
	protected static CheckoutPage checkoutPage;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		landingPage = new LandingPage(driver);
		restaurantsPage = new RestaurantsPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}
}
