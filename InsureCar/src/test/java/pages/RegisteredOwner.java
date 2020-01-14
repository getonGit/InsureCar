package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisteredOwner {

	//driver 
	protected WebDriver driver;

	// Using page factory FindBy method to find all the elements in this page

	@FindBy(xpath = "//button[@data-test-id='shared.yes']")
	protected static WebElement carOwnerYesBtn;
	
	@FindBy(xpath = "//button[@data-test-id='shared.no']")
	protected static WebElement carOwnerNoBtn;
	
	
	@FindBy(xpath = "//button[@data-test-id='quoting.selectRegisteredOwner.used']")
	protected static WebElement usedCar;
	
	@FindBy(xpath = "//button[@data-test-id='quoting.selectRegisteredOwner.brandNew']")
	protected static WebElement newCar;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	protected static WebElement submitBtn;

	
	public RegisteredOwner(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void fill_OwnerDetails(WebDriver driver) {
		
		carOwnerYesBtn.click();
		usedCar.click();
		waitForElement(submitBtn);
		submitBtn.click();
		}

 
	
	
	public void waitForElement(WebElement Element) {
		WebElement myElement = (new WebDriverWait(driver, 15)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(Element));

	}
}
