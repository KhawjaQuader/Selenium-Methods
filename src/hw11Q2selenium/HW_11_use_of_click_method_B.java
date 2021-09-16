package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_click_method_B {
	WebDriver driver;
	
	@BeforeTest
	  public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.ebay.com/"); 
		  Thread.sleep(3000);
	  }
	  
	 @Test
	 public void ebeySearchFieldButtonTest() {
		 driver.findElement(By.id("gh-btn")).click();
			
		}
	  @AfterTest
		public void tearUp() {
			driver.quit();
		}

	  }
	  


