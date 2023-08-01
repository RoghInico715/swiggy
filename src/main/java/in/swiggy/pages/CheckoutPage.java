package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	private WebDriverWait wait;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[1]")
	private WebElement text;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public String getSignInText() {
		wait.until(ExpectedConditions.visibilityOfAllElements(text));
		String txt;
		txt = text.getText();
		return txt;
	}

}
