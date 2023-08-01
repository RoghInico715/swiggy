package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantsPage {

	private WebDriverWait wait;
	private Actions actions;
	
	@FindBy(xpath = "(//div[contains(@class, 'main_buttonNoImage')])[1]")
	private WebElement addButton;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/header/div/div/ul/li[1]/div/div/div")
	private WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/div[2]/div/div/div/div[4]")
	private WebElement checkoutBtn;
	
	public RestaurantsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		actions = new Actions(driver);
	}
	
	public void clickAddButton() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addButton));
		addButton.click();
	}
	
	public void hoverOverCart() {
		wait.until(ExpectedConditions.visibilityOfAllElements(cart));
		actions.moveToElement(cart).build().perform();
	}
	
	public void clickCheckoutBtn() {
		wait.until(ExpectedConditions.visibilityOfAllElements(checkoutBtn));
		checkoutBtn.click();
	}

}
