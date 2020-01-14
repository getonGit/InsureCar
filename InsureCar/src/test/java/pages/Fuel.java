package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fuel {

	
	
	//driver 
	protected WebDriver driver;

	
		
	public Fuel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}	
	


	public void choose_Fuel(WebDriver driver, String fuel) {
		
		WebElement fuelType = driver.findElement(By.xpath("//label[text()='" + fuel + "']"));
		fuelType.click();
		
		}

}
