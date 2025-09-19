package selenium_Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	File surce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 File dest = new File("C:\\Users.png");
	 
	 FileHandler.copy(surce, dest);

	}

}
