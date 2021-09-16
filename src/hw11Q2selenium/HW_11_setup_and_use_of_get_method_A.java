package hw11Q2selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *1.Create a package "hw11Q2selenium" inside the Selenium project and execute the remaining.
 *2. Read the question very carefully. Create a class and give a name. 
 *3.choose a website (from the project list, you can use multiple web site to show below messages, 
 *4.just create different class) and try to use the below methods. 
 *5.get(), maximize(), click(), isDisplayed(), isEnabled(), isSelected(), navigate(), sendKeys(). 
 *6.Also use all types of locator which are unique (1 of 1). 
 *7.also implements clear(), close(), quit(), Keys.ENTER, Actions class methods, getText(), fullScreen(), getSize(), deleteAllCookies(), Dimension Class, setSize() methods. 
 *8.Please push the code in github and share the link below.
 */
 // Selenium set up get method with manage, window, maximize screen and quite method used CVS web site with main method
public class HW_11_setup_and_use_of_get_method_A {

	public static void main(String[] args) throws InterruptedException {//main method utilized
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();//Webdriver is Interface instantiated with the concrete Class ChromeDriver 
    driver.manage().window().maximize();//driver object used for the function of manage,window,maximize web site screen
    driver.get("https://www.cvs.com/");//get method utilized to call CVS web site by copy web site link
    Thread.sleep(3000);//Thread utilized to keep web site screen alive for 3 second
    driver.quit();//To stop or complete the function quite method used
	}

}
