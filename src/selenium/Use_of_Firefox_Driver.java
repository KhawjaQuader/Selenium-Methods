package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_Firefox_Driver {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.aliexpress.com/");
	}
		@Test
		public void logoTest() {
			driver.findElement(By.className("logo-base"));
			
		}
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}
        
	}


