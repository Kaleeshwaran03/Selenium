package Refer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(frame);

		WebElement first =  driver.findElement(By.name("fname"));
		first.sendKeys("Kaleesh");

		WebElement lastname =  driver.findElement(By.name("lname"));
		lastname.sendKeys("Hello");

		//Second frame

		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src=\'innerFrame\']"));
		driver.switchTo().frame(secondFrame);

		driver.findElement(By.name("email")).sendKeys("krishkaleesh");


		driver.switchTo().parentFrame();  //back to previous frmae
		lastname.clear();
		lastname.sendKeys("welcome back");

		//	driver.findElement(By.name("lname")).sendKeys("welcome back");

		driver.switchTo().defaultContent(); // (back to main )


	}

}
