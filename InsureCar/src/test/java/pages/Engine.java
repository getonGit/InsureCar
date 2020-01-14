package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Engine {

	
	
	
	//driver 
	protected WebDriver driver;



	
	public Engine(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void choose_Engine(WebDriver driver,  String engine) {
		WebElement engineType = driver.findElement(By.xpath("//label[text()='" + engine + "']"));
		engineType.click();
		
		}


}
