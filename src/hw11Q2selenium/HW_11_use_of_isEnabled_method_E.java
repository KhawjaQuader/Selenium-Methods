package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_isEnabled_method_E {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	Thread.sleep(4000);
}
	
	@Test(enabled = true, priority = 1)
	public void logoTest() throws InterruptedException {
		boolean elementEnabled = driver.findElement(By.xpath("//a[@id='gh-la']")).isEnabled();
	System.out.println(elementEnabled);
	}	//similar like isDisplayed
	
	@AfterTest
	public void tearUp() {
		driver.quit(); 
	}
	
}
