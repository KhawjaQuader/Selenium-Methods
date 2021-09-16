package hw11Q2selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_11_use_of_Maximize_Driver {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.t-mobile.com/");
	Thread.sleep(4000);
}
	
	@Test(enabled = true, priority = 1)
	public void maximizeWindow() {
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}	
	@Test(enabled = true, priority = 2)
	public void fullScreenWindow() throws InterruptedException {
		driver.manage().window().fullscreen();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
	}	
	
	@Test(enabled = true, priority = 3)
	public void sizeOfWindow() throws InterruptedException {
		driver.manage().window().fullscreen();
		System.out.println("This size of the screen is:"+driver.manage().window().getSize());
		driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
	}
	@Test(enabled = true, priority = 4)
	public void deleteCookies() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cvs.com/");
		Thread.sleep(3000);
	}	
	@Test(enabled = true, priority = 5)
	public void setAspecificSizeWindow() throws InterruptedException {
		Dimension dimension = new Dimension(500,500);
		driver.manage().window().setSize(dimension);
		driver.get("https://www.cvs.com/");
		
	}	

	
	/*@Test(enabled = true, priority = 5)
	public void waitForWindow() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().window().wait(3000);
		driver.manage().deleteAllCookies();
		driver.get("https://www.staples.com/");
		Thread.sleep(3000);
	}*/
	@AfterTest
	public void tearUp() {
		driver.close(); 
	}
	
}
