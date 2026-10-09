package oct5;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Propertyfile {
WebDriver driver;
Properties conpro;
@Test
public void validateLogin()throws Throwable
{
	conpro = new Properties();
	//load property file
	conpro.load(new FileInputStream("Login.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(conpro.getProperty("Url"));
	driver.findElement(By.id("txtUsername")).sendKeys(conpro.getProperty("ObjUser"));
	driver.findElement(By.id("txtPassword")).sendKeys(conpro.getProperty("Objpass"));
	driver.findElement(By.id("btnLogin")).click();
	driver.quit();
}
}
