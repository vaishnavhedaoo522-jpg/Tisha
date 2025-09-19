package selenium_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webdriver_methods {

	
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromerdriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	
	driver.manage().window().minimize();
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	
	//System.out.println(driver.getPageSource());
	
}
}
