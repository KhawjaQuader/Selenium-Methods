package hw12Q2selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Create a package "hw12Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. pageLoadTimeout(), setScriptTimeout(), JavascriptExecutor for click and send keys, 3 methods of dropdown, right click action and handling Alert. Use terminal from eclipse IDE, Please push the code in github and share the link below.
 */
public class HW_12_D_use_of_Rightclick {

WebDriver driver;
	
	@BeforeTest
	  public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("http://demo.guru99.com/test/simple_context_menu.html"); 
		  
	  }
	  
	@Test(priority = 1)
	public void rightActionTest() throws InterruptedException  {
	Actions actions = new Actions(driver);
	WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
	actions.contextClick(rc).build().perform();
	WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
	Thread.sleep(5000);
	edit.click();
	Thread.sleep(5000);
	Alert alert = driver.switchTo().alert();
	System.out.println("\nAlert text:"+alert.getText());
	alert.accept();
		}
	
	@AfterTest
	public void tearUp() {
	driver.quit();
	  }
	
}
