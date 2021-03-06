package hw10Q2selenium;
/* 
 *1.Create a package "hw10Q2selenium" 
 *2.inside the Selenium project and execute the remaining. Read the question very carefully. 
 *3.Create a class and give a name.
 *4 choose a website (from the project list, you can use multiple website to show below messages, 
 *5 just create different class) and try to use the below methods.
 *6. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1).
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_10_selenium_C_click_method_by_different_locators {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {// set up for testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		driver = new ChromeDriver();// Instantiation
		driver.manage().window().maximize();// method for screen maximize
		driver.get("https://www.aa.com/homePage.do");// Working on this web site used get method
		Thread.sleep(5000);// Thread is a class used for display web element for 5 second
	}

	@Test(enabled = false, priority = 1) // Use boolean type for execution or to run
	public void planTravelButtonFieldTest() throws InterruptedException {// Testing the plan travel button by creating
	driver.findElement(By.id("plan-travel-expander")).click();// Here using Id as locator we have to type By.
	Thread.sleep(3000);

	}

	@Test(enabled = false, priority = 2)
	public void joinButtonFieldTest() throws InterruptedException {// Testing Join Button by creating joininButtontest
	    driver.findElement(By.className("header-button")).click();// Class Name locator used click method
	    Thread.sleep(3000);
	}
    //We have to use webdriver wait, it is failing now 
	@Test(enabled = false, priority = 3)
	public void departDateFieldTest() throws InterruptedException {// Testing departDate from AA wesite by creating method
		//Thread.sleep(3000);
		driver.findElement(By.name("departDate")).click();// Name locator used
		Thread.sleep(3000);

	}

	@Test(enabled = false, priority = 4)
	public void travelWithConfidenceBigRectangleBoxFieldTest() throws InterruptedException {		
	driver.findElement(By.cssSelector(".span6.bannerContainerB1.bannerCard")).click();// CSS selector for class locator use period or . dot														
	Thread.sleep(5000);

	}
	
	@Test(enabled = true, priority = 5)
	public void planTravelButtonTest() throws InterruptedException {		
	driver.findElement(By.cssSelector("#plan-travel-expander")).click();// # hash sign used for ID locator															
	Thread.sleep(5000);

	}

	@Test(enabled = false, priority = 6)
	public void searchFieldBlueButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).isDisplayed();
		Thread.sleep(5000);
	}

    @Test(enabled = false, priority = 7)
    public void loginButtonBelowFieldTest() throws InterruptedException {
	driver.findElement(By.xpath("//div[text()='Have an AAdvantage? account?']")).isEnabled();
	Thread.sleep(5000);
    }
    
    @Test(enabled = false, priority = 8)
    public void preparedForTheAirFieldTest() throws InterruptedException {//contains used
    	driver.findElement(By.xpath("//button[contains(@name,'linkCancelTrip') and @id='linkCancelTrip']")).isSelected();
    	Thread.sleep(5000);
    }
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
