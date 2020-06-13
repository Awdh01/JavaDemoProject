import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase03 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\AK practice\\01testcase\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://selenium-examples.nichethyself.com/customised.html");
		driver.findElement(By.xpath("//label[contains(text(),'England')]//input")).click();;
		
		
	}

}
