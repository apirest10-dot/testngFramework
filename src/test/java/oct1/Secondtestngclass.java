package oct1;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pack.AppUtil1;
public class Secondtestngclass extends AppUtil1 {
	@Test
	public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("87654");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("4554");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String addres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(addres+"  "+"Executing Addition test",true);
	}
	@Test
	public void division()
	{
		driver.findElement(By.name("display")).sendKeys("7677767");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("5");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String divres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divres+"  "+"Executing division test",true);
	}
	@Test
	public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("56565");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("56");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String mulres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulres+"  "+"Executing multiplication test",true);
	}

}
