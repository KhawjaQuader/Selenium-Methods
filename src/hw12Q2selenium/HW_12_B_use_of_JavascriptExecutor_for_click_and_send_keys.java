package hw12Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_12_B_use_of_JavascriptExecutor_for_click_and_send_keys {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;// Casting is javascriptExecutor
    //We can also use JavascriptExecuter js; on above line 
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gtalk.us/pinless/user/login");
	}

	@Test(priority = 1)
	public void loginButtonTest01() throws InterruptedException {// Below is alternate of this one function
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 2) 
	public void loginButtonTest02() throws InterruptedException {
		js.executeScript("document.getElementById('btnSubmit').click();");// This is one way
		Thread.sleep(3000);
	}
                        
	@Test(priority = 3) // Try to avoide use this function as it does not execute with xpath  VVIMP
	public void loginButtonTest03() throws InterruptedException {// Interview Q if the web element can not be find out or  hidden what you will use
		//Below line can exclude if we just write javascriptExecuter js; below Webdriver driver below the class name 			
		JavascriptExecutor js = (JavascriptExecutor) driver; // Interview A javascriptExecuter is used to find the webelement
		js.executeScript("document.getElementById('btnSubmit').click();");// This is one way
		Thread.sleep(3000);
	}

	@Test(priority = 4) //This is the most effective one function or formula for execution
	public void loginButtonTest04() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));//Loginbutton is Webelement type
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click()",loginButton);//arguments 0 represent the first to show find loginButton with xpath
		Thread.sleep(3000);//alternative to click an webelement
	}
	@Test(priority = 5)//Below all are high level but Less important one kind of click and other function
	public void loginButtonTest05() throws InterruptedException {
		driver.findElement(By.id("btnSubmit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void gTalkLoginButtonTest06() {
		Actions actions = new Actions(driver);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
		actions.click(loginButton).perform();
	}
	@Test(priority = 7)
	public void gTalkLoginButtonTest07() {
		Actions actions = new Actions(driver);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
		actions.moveToElement(loginButton).click().perform();//Finding the webelement by moveToElement method & click & perform
	}
	@Test(priority = 8)
	public void gTalkLoginButtonTest08() {
		Actions actions = new Actions(driver);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
		actions.clickAndHold(loginButton).release().perform();
	}
	@Test(priority = 9)
	public void gTalkLoginButtonTest09() {
		Actions actions = new Actions(driver);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
		actions.sendKeys(loginButton,Keys.RETURN).perform();//Keys.ENTER & Keys.RETURN are same
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
