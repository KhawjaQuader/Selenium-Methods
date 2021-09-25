package hw12Q2selenium;
/*
 * Create a package "hw12Q2selenium" inside the Selenium project and execute the remaining. Read the question very carefully. Create a class and give a name. choose a website (from the project list, you can use multiple website to show below messages, just create different class) and try to use the below methods. pageLoadTimeout(), setScriptTimeout(), JavascriptExecutor for click and send keys, 3 methods of dropdown, right click action and handling Alert. Use terminal from eclipse IDE, Please push the code in github and share the link below.
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_12_A_use_of_pageLoadTimeout_setScriptTimeout {
WebDriver driver;

    @BeforeTest
    public void setUp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Khawja Zishan Quader\\eclipse-workspace\\SelleniumProjects\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
}
@Test
public void pageLoadTimeOutForWindow() {
driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.MILLISECONDS);
driver.get("https://www.ebay.com/");
}
@Test
public void setScriptTimeOutForWindow() {
driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
driver.get("https://www.cvs.com/");
}
@AfterTest
public void tearUp() {
	driver.close();
}


}
