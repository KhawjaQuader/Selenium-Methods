package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_sendKey_click_clear_method_with_keys_enter_function_I {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	Thread.sleep(4000);
}
	
	@Test(enabled = false, priority = 1)
	public void testSearchButtonAfterWritingItemNameInSearchField() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).clear();
	}
	
	@Test(enabled = true, priority = 2)
	public void testSearchButtonAfterSecondItemInSearchFeid() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("TV",Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit(); 
	}
	
}
