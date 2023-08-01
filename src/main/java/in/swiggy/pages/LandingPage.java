package in.swiggy.pages;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]")
	private WebElement autoFillBox;
	
	@FindBy(xpath = "(//img[contains(@alt , 'Taj Mahal-Abids')])[1]")
	private WebElement topRestaurantChain;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public void enterDeliveryLocation(String string) {
		location.sendKeys(string);
	}
	
	public void selectFirstOptionFromAutofill() {
		wait.until(ExpectedConditions.visibilityOfAllElements(autoFillBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickOnFirstTopRestaurantChain() {
		wait.until(ExpectedConditions.visibilityOfAllElements(topRestaurantChain));
		topRestaurantChain.click();
	}
}
