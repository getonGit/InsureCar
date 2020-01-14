package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyType {

	
	//driver 
	protected WebDriver driver;

	// Using page factory FindBy method to find all the elements in this page

	
		
	public BodyType(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		
	}	
	


	public void choose_BodyType(WebDriver driver, String body) {
		
		WebElement bodyType = driver.findElement(By.xpath("//label[text()='" + body + "']"));
		bodyType.click();
		
		}

}
