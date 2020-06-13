import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\AK practice\\01testcase\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	
	   driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	   driver.findElement(By.xpath("//div[@id='start']//button")).click();
	   Thread.sleep(5000);
	   String text=driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
	   System.out.println("How r u1");
	   System.out.println(text);
	   System.out.println("How r u");
	   
	  
	   if(text.contains("Hello World!")){

		   System.out.println("Expected text is obtained");
		   }
	   else
		   {
		   System.out.println("Expected text is not obtained");
		   }
	 
	    driver.quit();
	    
	}

	
}
