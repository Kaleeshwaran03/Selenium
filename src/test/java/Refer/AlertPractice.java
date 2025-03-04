package Refer;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AlertPractice {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept")).click();
		Alert accept = driver.switchTo().alert();		
		String text = accept.getText();		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirm")).click();
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("okay");
		prompt.accept();
		
		
		
	}

}
