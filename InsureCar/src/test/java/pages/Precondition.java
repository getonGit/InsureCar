package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Precondition {

	//driver 
			protected WebDriver driver;

			// Using page factory FindBy method to find all the elements in this page

			@FindBy(xpath = "//button[@value='keepingCar']")
			protected static WebElement changeInsurerBtn;
	
			@FindBy(xpath = "//button[@value='buyingCar']")
			protected static WebElement changeOwnerBtn;
	
			@FindBy(xpath = "//input[@name='inceptionDate']")
			protected static WebElement inceptionDate;
	
			@FindBy(xpath = "//button[@type='submit']")
			protected static WebElement submitBtn;
	
			String incDate = "01.01.2020";
			public Precondition(WebDriver driver) {
				// TODO Auto-generated constructor stub
				this.driver = driver;
				PageFactory.initElements(driver, this);
				
			}

 



			public void fill_Preconditions(WebDriver driver) {
				
				changeInsurerBtn.click();
				inceptionDate.sendKeys(incDate);
				waitForElement(submitBtn);
				submitBtn.click();
				}

		 
			
			
			public void waitForElement(WebElement Element) {
				WebElement myElement = (new WebDriverWait(driver, 15)).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(Element));

			}
	
	
}
