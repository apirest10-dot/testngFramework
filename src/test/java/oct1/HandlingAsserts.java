package oct1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class HandlingAsserts {
WebDriver driver;
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
@Test
public void passtest()
{
	driver.get("https://facebook.com");
	String Expected ="Google";
	String Actual = driver.getTitle();
	try {
		Assert.assertEquals(Actual, Expected,"Title is Not matching");
	} catch (AssertionError e) {
		Reporter.log(e.getMessage(),true);
	}
	
}
@Test
public void passfail()
{
	driver.get("https://gmail.com");
	String Expected ="Google";
	String Actual = driver.getTitle();
	try {
		Assert.assertEquals(Actual, Expected,"Title is Not matching");	
	} catch (AssertionError e) {
		Reporter.log(e.getMessage(),true);
	}
	
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
