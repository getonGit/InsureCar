package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BirthDetails {

	//driver 
		protected WebDriver driver;

		// Using page factory FindBy method to find all the elements in this page

		@FindBy(xpath = "//span[contains(text(),'Wann war die Erstzulassung?')]")
		protected static WebElement getPageText;
		
		
			
		String actualText;
		public BirthDetails(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
			
			
		}	
		
		public void check_BirthPage(WebDriver driver) {
			
			actualText = driver.findElement(By.xpath("//span[contains(text(),'Wann war die Erstzulassung?')]")).getText();
			Assert.assertEquals(actualText, "Wann war die Erstzulassung?");
			
			}
	
}
