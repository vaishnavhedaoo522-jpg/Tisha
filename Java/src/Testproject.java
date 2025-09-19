import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Testproject{



	public static  void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
          
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.w3schools.com/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		//driver.close();
		
     WebElement Female = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		boolean Result = Female.isSelected();
		
		System.out.println(Result);
		//Thread.sleep(2000);
		Female.click();
		boolean Result2 = Female.isEnabled();
		System.out.println(Result2);
		Thread.sleep(2000);
		Female.click();
		boolean Result3 = Female.isSelected();
		System.out.println(Result3);
		Thread.sleep(2000);
		driver.navigate().to("https://omayo.blogspot.com");
		WebElement Hiddenbutton = driver.findElement(By.id("hbutton"));	
		boolean A1 = Hiddenbutton.isDisplayed();
		System.out.println(A1);
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']"));
		boolean A2 = button2.isDisplayed();
		System.out.println(A2);	
		
		File sshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(sshot,new File("C:\\Automation\\Rahul.jpg"));
		
		}

	
	}