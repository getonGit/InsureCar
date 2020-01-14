package friday.InsureCar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.*;
import resources.ConfigFileReader;



/**
 * Unit test for simple App.
 */
public class AppTest {

	public static WebDriver driver;
	ConfigFileReader configFileReader;
	public ExtentTest test;
	public ExtentReports report;
	public static String testExecutionStartTime;
	Precondition page1;
	RegisteredOwner page2;
	Brand page3;
	Model page4;
	BodyType page5;
	Fuel page6;
	Engine page7;
	MyCar page8;
	BirthDetails birthPage;
	 
	RegistrationDate page9;
	String browserType;
	
	
	public void setup() {

		test.log(LogStatus.INFO, "Start to invoke browser");
		try {
			browserType = configFileReader.getbrowserType();
			System.out.println(browserType );
			
			if(browserType.equals("chrome"))
			 {
			
				System.setProperty("webdriver.chrome.driver", configFileReader.getchromeDriverPath());
				
				driver = new ChromeDriver();
				test.log(LogStatus.INFO, "chrome browser invoked");
			 } 
			 else if (browserType.contentEquals("firefox"))
			 {
				 System.setProperty("webdriver.gecko.driver", configFileReader.getfirefoxDriverPath());

					driver = new FirefoxDriver();
					test.log(LogStatus.INFO, "firefox  browser invoked");
			 }
					 
			 
		//	configFileReader = new ConfigFileReader();
			

			driver.manage().window().maximize();
		
			test.log(LogStatus.INFO, "browser maximizing... ");
			driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
			

			System.out.println(configFileReader.getApplicationUrl());
			
			driver.get(configFileReader.getApplicationUrl());
			
			test.log(LogStatus.INFO, "website Invoked :: ");

		} catch (Exception e) {
			//test.log(LogStatus.ERROR, "error in invokeBrowser method");
			//Assert.fail("Because an Exception occured..");
		}

	}



	@BeforeSuite
	public void initialization() {
		try {

			configFileReader = new ConfigFileReader();
			
			String ReportPath = configFileReader.getExtentReportPath();
			report = new ExtentReports(ReportPath);
			System.out.println(ReportPath);

			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@AfterSuite
	public void cleanup() {
		report.endTest(test);
		report.flush();
		
	}
	
	 
	
	
	
	@Test(dataProvider="CarObject", dataProviderClass=resources.CarDataProvider.class)
	public void testcar(String Brand, String Model, String Body, String Fuel, String Engine, String Car) 
	
	
	
	{
		test = report.startTest("Selecting the Car: " + Car + " to be insured by answering queries");
		setup();
		try {

			page1 = new Precondition(driver);
			page1.fill_Preconditions(driver);
			page2 = new RegisteredOwner(driver);
			page2.fill_OwnerDetails(driver);
			test.log(LogStatus.INFO, "Choosing the brand of the car");
			page3 = new Brand(driver);
			
			page3.pickBrand(driver, Brand);
			test.log(LogStatus.INFO, "Choosing the model of the car");
			page4 = new Model(driver);
			page4.choose_Model(driver, Model);
				if (Body != " ") {
					test.log(LogStatus.INFO, "Choosing the bodytype of the car");
						page5 = new BodyType(driver);
						page5.choose_BodyType(driver, Body);
				}
				if (Fuel != " ") {
					test.log(LogStatus.INFO, "Choosing the fuel of the car");
			page6 = new Fuel(driver);
			page6.choose_Fuel(driver, Fuel);
			
			 
			}
				if (Engine != " ") {
					test.log(LogStatus.INFO, "Choosing the engine of the car");
			page7 = new Engine(driver);
			page7.choose_Engine(driver, Engine);
				}
				test.log(LogStatus.INFO, "Choosing the car make of the car");
			page8 = new MyCar(driver);
			page8.select_Car(driver, Car);
			test.log(LogStatus.INFO, "Choosing the registration date of the car");
			page9 = new RegistrationDate(driver);
			page9.fill_RegistrationDate(driver);
			
			test.log(LogStatus.PASS, "Successfully answered all questions and reached birth details page");
			 driver.close();
		} catch (Exception e) {

			test.log(LogStatus.ERROR, "Error during execution");
			e.printStackTrace();
			
		}
	}

 
	

}
