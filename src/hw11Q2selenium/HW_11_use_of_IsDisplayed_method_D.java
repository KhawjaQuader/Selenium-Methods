package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_IsDisplayed_method_D {
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
	public void ebeyLogoTest()  {
		Boolean elementLogo = driver.findElement(By.xpath("//a[@id='gh-la']")).isDisplayed();
		System.out.println(elementLogo);
	//Boolean is a type of action add to show true or false
	//isDisplayed is a method
	//Sysout is to print true or false
	//elementLogo is the name of element
	//We are testing with isDisplayed method	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit(); 
	}
	
}
