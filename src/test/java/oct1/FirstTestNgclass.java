package oct1;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pack.Apputil;
public class FirstTestNgclass extends Apputil {
@Test(priority = 2,enabled = true)
public void admin()
{
	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Reporter.log("=========Executing Admin Test===========",true);
}
@Test(priority = 0,enabled = false)
public void pim()
{
	driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	Reporter.log("=========Executing Pim Test===========",true);
}
@Test(priority = 1,enabled = true)
public void leave()
{
	driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	Reporter.log("=========Executing Leave Test===========",true);
}
}
