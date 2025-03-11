package SceenShot_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptExecuto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options1=new ChromeOptions();
		options1.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options1);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
	     System.out.println("Alert was Handled Successfully");
		WebElement ele=driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[2]"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
	}

}
