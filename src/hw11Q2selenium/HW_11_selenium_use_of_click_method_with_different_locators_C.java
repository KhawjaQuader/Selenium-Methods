package hw11Q2selenium;
/*
 * Creating Click method with Setup and different locators
 * 1.ID 2. NAME 3.CLASS NAME 4.TAG NAME 5.LINK TEXT 6.PARTIAL LINK TEXT 7.CSS SELECTER 7.XPATCH 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_selenium_use_of_click_method_with_different_locators_C {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uhc.com/");
		Thread.sleep(3000);
	}

	@Test
	public void utest() {
		driver.findElement(By.("")).click();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
