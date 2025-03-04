package Refer;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDragandDropScreenshot {


	public static void main(String[] args) throws IOException {
		    WebDriverManager.chromedriver().setup();
	        WebDriver A = new ChromeDriver();
	        
	        A.get("http://demo.guru99.com/test/drag_drop.html");	        
	        A.manage().window().maximize();	  
	        
	        WebElement drag = A.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	        WebElement drop = A.findElement(By.xpath("//li[@class='placeholder'])[1]"));
	        
	        Actions B = new Actions(A);
	        B.dragAndDrop(drag, drop).build().perform();
	        
	        TakesScreenshot Take = (TakesScreenshot)A;
	        File src = Take.getScreenshotAs(OutputType.FILE);
	        File des = new File ("\\home\\kaleesh\\eclipse-workspace\\Facebook\\target.png");
	        FileUtils.copyFile(src, des);
	        
	        System.out.println("website title: " + A.getTitle());
	}
}



