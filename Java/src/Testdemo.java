import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
			driver.get("https://profile.w3schools.com/signup");
		  driver.manage().window().maximize();
		 // Thread.sleep(2000);
		//  driver.close();
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vhspicy9rasoi@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vhspicy@123");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("Vaishnav");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("Hedaoo");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		 String text= driver.findElement(By.xpath("//span[@class='SignUpForm_text__UNhtT']")).getText();
		 
		 System.out.println("text is"+text);

         System.out.println(driver.getCurrentUrl());
		  Thread.sleep(2000);
	         System.out.println(driver.getTitle());
	         Thread.sleep(2000);
	         
	        driver.navigate().to("https://www.javatpoint.com/");
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@type ='checkbox']")).isSelected();    
	        
	        
	      	        
	}
}
