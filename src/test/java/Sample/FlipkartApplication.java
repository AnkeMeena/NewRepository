package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartApplication {

	public static void main(String[] args) {
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		String value="i phone 14";
		element.sendKeys(value);
		driver.navigate().refresh();
		element.sendKeys(value);
		

	}

}
