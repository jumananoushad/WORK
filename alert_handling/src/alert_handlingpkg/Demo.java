package alert_handlingpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
	driver.findElement(By.name("B1")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.switchTo().alert().accept();
     driver.findElement(By.name("B2")).click();
     driver.switchTo().alert().dismiss();
     driver.findElement(By.name("B3")).click();
     driver.switchTo().alert().sendKeys("hello");
     driver.switchTo().alert().accept();
     
     

	}

}
