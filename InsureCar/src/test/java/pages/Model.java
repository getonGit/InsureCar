package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Model {

	
	//driver 
			protected WebDriver driver;

			
			
			public Model(WebDriver driver) {
				// TODO Auto-generated constructor stub
				this.driver = driver;
				PageFactory.initElements(driver, this);
				
			}	
			
	
			public void choose_Model(WebDriver driver, String model) throws InterruptedException {
				
				System.out.println("model is " + model);
				
				WebElement modelName = driver.findElement(By.xpath("//button[@name='model']//label[text()='" + model + "']"));
			     modelName.click();
				
				}

		 
			
			
		



			public void waitForElement(WebElement Element) {
				WebElement myElement = (new WebDriverWait(driver, 15)).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(Element));

			}
}
