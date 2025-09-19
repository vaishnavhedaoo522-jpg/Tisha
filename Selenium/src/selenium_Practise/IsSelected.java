package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {



   public static void main(String[] args) throws InterruptedException {

	   WebDriver driver =new ChromeDriver();

   driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
   
   driver.switchTo().frame("iframeResult");

      WebElement element = driver.findElement(By.xpath("//input[@id=\"html\"]"));
      
         boolean status = element.isSelected();
   
          System.out.println("check the radio is slected or not "+status);
          
         WebElement model2 = driver.findElement(By.xpath("//*[@id=\"css\"]"));
          
          model2.click();
          Thread.sleep(3000);
          
          WebElement model = driver.findElement(By.xpath("//*[@id=\"css\"]"));
          
          boolean status1 = model.isSelected();
          
          System.out.println("check the radio is slected or not "+status1);
          
          
          
        
   }
}
