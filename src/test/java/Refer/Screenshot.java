package Refer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException, IOException   {
  
    	  WebDriverManager.chromedriver().setup();
          WebDriver A = new ChromeDriver();      
           
          A.get("http://demo.guru99.com/test/drag_drop.html");
          A.manage().window().maximize();
         
            Actions actions = new Actions(A);

            WebElement source1 = A.findElement(By.xpath("//li[@id='credit2']"));
            WebElement target1 = A.findElement(By.xpath("//ol[@id='bank']"));

            WebElement source2 = A.findElement(By.xpath("//li[@id='credit1']"));
            WebElement target2 = A.findElement(By.xpath("//ol[@id='loan']"));
          
            actions.dragAndDrop(source1, target1).perform();
            actions.dragAndDrop(source2, target2).perform();
         
            //File screenshot = ((TakesScreenshot) A).getScreenshotAs(OutputType.FILE);
            //FileUtils.copyFile(screenshot, new File("screenshot.png"));
            
            TakesScreenshot Ab = (TakesScreenshot)A;
            File C = Ab.getScreenshotAs(OutputType.FILE);
            File S = new File("/home/kaleesh/Documents/Important Coding Files/eclipse-workspace/Facebook/target.png");
            FileUtils.copyFile (C, S);
                       		

            System.out.println("Drag and drop completed and screenshot taken.");
            Thread.sleep(2000);
            A.quit();
            
        }
    
}







