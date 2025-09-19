package M3;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GH {

	public static void main(String[] args)
	{
		
         //Webdrivermanager.chromedriver.setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		
		
		
		System.err.println(driver.getTitle());
		 
	}

}
