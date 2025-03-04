package Refer;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> header = table.findElements(By.tagName("th"));

		for(WebElement head : header) {
			String value = head.getText();
			System.out.println(value);
		}

		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println(size);

		for(WebElement first : allrows) {			
			String a = first.getText();
			System.out.println(a);
		}

		// first column 

		for(WebElement col : allrows) {

			List<WebElement> secol = col.findElements(By.tagName("td"));
			WebElement column = secol.get(0);
			String text = column.getText();
			System.out.println(text);
		}

		//	second column 
		 
		/*for(WebElement foreeach1 : allrows) {

			List<WebElement> secondcolumnn = foreeach1.findElements(By.tagName("td"));
			WebElement colum = secondcolumnn.get(1);
			String st = colum.getText();
			System.out.println(st);
			if(st.equals("Raj")) {
				WebElement tick = secondcolumnn.get(3).findElement(By.tagName("input"));
				tick.click();
			}

		} */

		for(int i =0; i<size; i++) {
			List<WebElement> name = allrows.get(i).findElements(By.tagName("td"));
			WebElement last = 	name.get(1);
			String as = last.getText();
			System.out.println(as);
			if(as.equals("Raj")) {
				WebElement input =  name.get(3).findElement(By.tagName("input"));
				input.click();
				//	break;
			}
		}

		//	driver.quit();

	}

}




