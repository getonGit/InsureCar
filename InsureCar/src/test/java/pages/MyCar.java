package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCar {

	
	//driver 
	protected WebDriver driver;

	// Using page factory FindBy method to find all the elements in this page

	
	
	public MyCar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		
	}

		
	


	public void select_Car(WebDriver driver, String selectCar) {
		WebElement selectedCar = driver.findElement(By.xpath("//label[text()='" + selectCar + "']"));
		selectedCar.click();
		
		}
	
	
}
