package hw11Q2selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_HoverOver_Action_method {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.t-mobile.com/");
	Thread.sleep(4000);
}
	
	@Test(enabled = true, priority = 1)
	public void mouseHoverActionOnDealsTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement deals = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-2']"));
		Thread.sleep(3000);
		actions.moveToElement(deals).build().perform();
		Thread.sleep(5000);
		System.out.println(deals.getText());
		Thread.sleep(3000);
	}	
	
	@AfterTest
	public void tearUp() {
		driver.close(); 
	}
	
}
