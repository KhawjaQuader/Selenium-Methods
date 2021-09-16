package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_isSelected_methor {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cvs.com/pharmacy/v2/?icid=cvsheader:pharmacy#/pharmacy");
	Thread.sleep(4000);
}
	
	@Test(enabled = true, priority = 1)
	public void checkBoxNameRememberMeTest() throws InterruptedException {
		boolean elementSelected = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();
	System.out.println(elementSelected);
	Thread.sleep(3000);
	}	
	
	@AfterTest
	public void tearUp() {
		driver.quit(); 
	}
	
}
