package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
		    
		  WebElement text = driver.findElement(By.xpath("//*[@id=\"myDIV\"]"));
		  Thread.sleep(3000);
		  
		    boolean Status = text.isDisplayed();
		    
		    System.out.println("check text is available or not "+Status);
		    
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id=\"main\"]/button")).click(); 
		    
		    
		    
		    boolean Status2 = text.isDisplayed();
		    

		    System.out.println("check text is available or not "+Status2);
		  

	}

}
