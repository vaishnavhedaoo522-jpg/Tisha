package selenium_Practise;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("vhspicy9rasoi@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input [@id = 'pass']")).sendKeys("Vhspicy@123");
		
		 WebElement ff = driver.findElement(By.xpath("//button"));
			Thread.sleep(4000);
			
			
			boolean status = ff.isDisplayed();
			
			System.out.println("ff"+status);
			
		 
		
			
	}

}
