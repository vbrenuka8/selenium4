package SceenShot_JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_ScreenShot_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://demowebshop.tricentis.com/");
       //Search Text Field
       WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
       searchtxt.sendKeys("mobiles");
       //Typecasting
       TakesScreenshot ts=(TakesScreenshot)driver;
       File srcfile=searchtxt.getScreenshotAs(OutputType.FILE);
       File destfile=new File("./ScreenPictures/searchfield.png");
       FileHandler.copy(srcfile, destfile);
       System.out.println("Screenshot on the WebElement searchtxt field was successful");
       
       WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
       File src=searchbutton.getScreenshotAs(OutputType.FILE);
       File dest=new File("./ScreenPictures/searchbutton.png");
       FileHandler.copy(src, dest);
       System.out.println("Screenshot on the search button was successful");
       driver.close();
	}

}
