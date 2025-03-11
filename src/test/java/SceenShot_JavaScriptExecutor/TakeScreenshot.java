package SceenShot_JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      
      //Screenshot after clicking on search
        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcfile=ts.getScreenshotAs(OutputType.FILE);
        File destfile=new File("./ScreenPictures/searchpage.png");
        FileHandler.copy(srcfile, destfile);
        
        System.out.println("Screenshot on the searchpage was successful");
        
        driver.close();
	}

}
