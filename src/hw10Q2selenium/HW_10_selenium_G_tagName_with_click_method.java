package hw10Q2selenium;
/*
 *1.Create a package "hw10Q2selenium" 
 *2.inside the Selenium project and execute the remaining. Read the question very carefully. 
 *3.Create a class and give a name.
 *4 choose a website (from the project list, you can use multiple website to show below messages, 
 *5 just create different class) and try to use the below methods.
 *6. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys().
 * Also use all types of locator which are unique (1 of 1). 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterTest;
//Use of get method
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HW_10_selenium_G_tagName_with_click_method {
  WebDriver driver;
  
  @BeforeTest
  public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.aa.com/homePage.do"); 
	  Thread.sleep(5000);
  }
  
  @Test
	public void joinButtonTest() throws InterruptedException {
//driver.findElement(By.tagName("a"));//Click method can not go with this ???
		Thread.sleep(5000);
	}
  @AfterTest
	public void tearUp() {
		driver.quit();
	}

  }
  


