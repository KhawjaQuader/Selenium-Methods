package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_FirefoxDriver {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.ebay.com/");
	Thread.sleep(3000);
	}
	@Test
	public void searchFieldBlueButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
