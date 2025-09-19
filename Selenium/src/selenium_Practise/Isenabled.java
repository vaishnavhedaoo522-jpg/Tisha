package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		
		driver.switchTo().frame("iframeResult"); 
		
		Thread.sleep(2000 );
		WebElement element = driver.findElement(By.xpath("//button [@type='button']"));
		
		boolean status5 = element.isEnabled();
		
		System.out.println("check button is enabled or not "+status5);
		
		Thread.sleep(2000 );
		
		driver.navigate().to("https://www.w3schools.com/spaces/index.php");
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/a"));
		 
		 boolean status6 = element2.isEnabled();
		 
			System.out.println("check button is enabled or not "+status6);
		
	}

}
