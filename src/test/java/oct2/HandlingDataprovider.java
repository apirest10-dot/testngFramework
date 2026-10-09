package oct2;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
public class HandlingDataprovider {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "dp")
	public void loginmethod(String user,String pass) throws Throwable {
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String Expected="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
		String Actual = driver.getCurrentUrl();
		try {
			Assert.assertEquals(Actual, Expected,"Invalid Login Deatils");
		} catch (AssertionError e) {
			Reporter.log(e.getMessage(),true);
		}
		}

	@DataProvider
	public Object[][] dp() {
		Object login[][]= {
				{"Admin","Qedge123!@#"},
				{"Test","Qedge123!@#"},
				{"Admin","Qedge"},
				{"","Qedge123!@#"},
				{"Admin",""}};
		return login;
	}


	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
