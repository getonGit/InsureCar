package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Brand {

	//driver 
		protected WebDriver driver;

		// Using page factory FindBy method to find all the elements in this page
		
		public Brand(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
	

		

		public void pickBrand(WebDriver driver2, String brand) {
			// TODO Auto-generated method stub
			WebElement brandName = driver.findElement(By.xpath("//label[text()='" + brand + "']"));
		     brandName.click();
		}

	 
		
		
		
	
}
