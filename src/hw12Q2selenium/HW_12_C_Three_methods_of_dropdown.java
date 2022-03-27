package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/*
 * Create a package "hw12Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. pageLoadTimeout(), setScriptTimeout(), JavascriptExecutor for click and send keys, 3 methods of dropdown, right click action and handling Alert. Use terminal from eclipse IDE, Please push the code in github and share the link below.
 */
public class HW_12_C_Three_methods_of_dropdown {
//Indexing, text & value **When there is drop down option class is used 
WebDriver driver;
	
	@BeforeTest
	  public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.ebay.com/"); 
		  
	  }
	  
	 @Test(priority = 1)
	 public void dropdownButtonWithIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));//1st define webelement
		Select select = new Select(dropdown);//select used instead of click
		Thread.sleep(3000);
		select.selectByIndex(2);//From the drop down start from 0 and will select number 2 drop down index to show number 3
		Thread.sleep(3000);//Select by index method 
		}
	 @Test(priority = 2)
	 public void selectByVisiblaTextTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);//select used instead of click
		Thread.sleep(3000);
		select.selectByVisibleText("Books");//Select by visible text
		Thread.sleep(3000);
		}
	 @Test(priority = 3)//To perform task go to web page bring item by using dropdown inspect & choose value number from select drop down option
	 public void selectByValueTextTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);//select used instead of click
		Thread.sleep(3000);
		select.selectByValue("2984");//Select by value text
		Thread.sleep(3000);
	 }
	  @AfterTest
		public void tearUp() {
			driver.quit();
	  }
	
}
