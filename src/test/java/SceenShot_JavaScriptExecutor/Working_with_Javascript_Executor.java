package SceenShot_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Javascript_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       driver.get("https://demowebshop.tricentis.com/");
	       //Typecasting of JavascriptExecutor with driver instance
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("document.getElementById('small-searchterms').value='mobiles'");
	       
	       WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
	       
	       js.executeScript("arguments[0].click();", searchbutton);
	       
	}

}
