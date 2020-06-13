import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfflineAssignment01 {
public static void main(String[]args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","E:\\AK practice\\01testcase\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebDriverWait wait=new WebDriverWait(driver, 60);
	
	driver.get("http://annauniv.edu/");	
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[contains(text(),'Departments')]")));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Departments')]"))));

	driver.findElement(By.xpath("//a[contains(text(),'Departments')]")).click();
    Actions action= new Actions(driver);
    action.moveToElement(driver.findElement(By.xpath("//strong[contains(text(),' Faculty of Civil Engineering ')]"))).build().perform();
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='menuItemText32']"))));
    action.moveToElement(driver.findElement(By.xpath("//div[@id='menuItemText32']"))).click().build().perform();
 
//    System.out.println(driver.getTitle());
    String pagetitle=driver.getTitle();
    if(pagetitle.equalsIgnoreCase(pagetitle)) {
    	System.out.println("Expectation text is obtained");
    }
    else {
		System.out.println("Expectation text is not obtained");
	}
	
  driver.findElement(By.xpath("//a[contains(text(),'Research Themes')]")).click();
 
	
	
	
	
	
	
}

}
