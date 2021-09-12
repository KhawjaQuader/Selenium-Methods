package hw10Q2selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*02) Create a package "hw10Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). Also use all types of locator which are unique (1 of 1).
  */
public class HW_10_selenium_A_get_method {//Get method utilized

	public static void main(String[] args) throws InterruptedException {//Main method used
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Webdriver is Interface and instantiated with Concrete class ChromeDr
        driver.manage().window().maximize();// Maximize the web page screen
        driver.get("https://www.aa.com/homePage.do");//American Airlines link used from web site
        Thread.sleep(5000);//Thread used to show AA web site for 5 second
        driver.quit();// Quit used to complete the task
        
	}
	

}
