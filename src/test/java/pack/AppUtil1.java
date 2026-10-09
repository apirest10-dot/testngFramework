package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil1 {
public static WebDriver driver;
@BeforeMethod
public static void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.qedgetech.com/calculator.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Reporter.log("=========Running in beforemethod===========",true);
}
@AfterMethod
public static void tearDown()
{
	driver.quit();
	Reporter.log("=========Running in aftermethod===========",true);
	
}
}
