package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationDate {
	//driver 
		protected WebDriver driver;

		// Using page factory FindBy method to find all the elements in this page

		@FindBy(css = "input[name='monthYearFirstRegistered']")
		protected static WebElement firstRgstrDt;
		
		@FindBy(css = "input[name='monthYearOwnerRegistered']")
		protected static WebElement ownerRgstrDt;

		@FindBy(xpath = "//button[@type='submit']")
		protected static WebElement submitBtn;

		String Date = "05.2019";
		public RegistrationDate(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		public void fill_RegistrationDate(WebDriver driver) {
			
			firstRgstrDt.sendKeys(Date);      
			ownerRgstrDt.sendKeys(Date);
			waitForElement(submitBtn);
			submitBtn.click();
			}

	 
		
		
		public void waitForElement(WebElement Element) {
			WebElement myElement = (new WebDriverWait(driver, 15)).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(Element));

		}
	
}
