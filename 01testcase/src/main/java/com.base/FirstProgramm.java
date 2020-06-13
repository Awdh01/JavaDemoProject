import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstProgramm {
	
	static int count =0;
	public FirstProgramm() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
	
//		System.setProperty("webdriver.chrome.driver", "E:\\AK practice\\01testcase\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "E:\\AK practice\\01testcase\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	    driver.manage().deleteAllCookies();
//	    WebDriverWait wait=new WebDriverWait(driver, 60);
	   
		
		
//		driver.get("https://www.google.com/");
//		driver.navigate().to("https://jqueryui.com/menu/");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
////		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-9\"]")));
//		Actions action=new Actions (driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"))).build().perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-10\"]")));
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]"))).build().perform();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-12\"]")));
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]"))).build().perform();
//		String sb=driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]")).getText();
//		System.out.println(sb);
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		List<WebElement> activelink=new ArrayList<WebElement>();
//		
//		for(int i=0;i<links.size();i++) {
//			if(links.get(i).getAttribute("href")!=null) {
//				activelink.add(links.get(i));
//				
//			}
//		}
//			for(int j=0;j<10;j++) {
//			System.out.println(activelink.get(j).getText());
//		}
//		
		
//		driver.quit();
		
		System.out.println("Mrinal");
		System.out.println("Awdhesh");
		System.out.println("hello");
		
		String s1="Rain@has&started*herenow ";
//		System.out.println(s1.replaceAll("a", ""));
		System.out.println(s1.indexOf("here"));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("now"));
		System.out.println(s1.indexOf("Rain"));
		String s2= "#GeeKs01for@gEEk07";
		System.out.println("Count ="+s2.replaceAll("[a-zA-Z0-9]", "").length());
		System.out.println(s2.replaceAll("[a-zA-Z0-9]", ""));
		System.out.println(s1.replaceAll("[a-zA-Z]", ""));
		System.out.println("special count =" +s1.replaceAll("[a-zA-Z]", "").length());
		
		FirstProgramm obj1  = new FirstProgramm();
		FirstProgramm obj2  = new FirstProgramm();
		FirstProgramm obj3  = new FirstProgramm();
		FirstProgramm obj4  = new FirstProgramm();
		FirstProgramm obj5  = new FirstProgramm();
		
		
		System.out.println("Object count = "+count);
		
		
		
//		 for(int i=0;i<s2.length();i++) {
//			 Character ch=s2.charAt(i);
//			 
//		 }
        
	}
	
	}



