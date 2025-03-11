package SceenShot_JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	driver.get("https://demowebshop.tricentis.com/");
	 	//Type cast to get the capabilities of takeScreenshot to the driver instance
	 	
	 	//Typecasting
	 	TakesScreenshot ts=(TakesScreenshot)driver;
	 	//Temporary Location
	 	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	 	//Destination File
	 	File destfile=new File("./ScreenPictures/HomePage.png");
	 	FileHandler.copy(srcfile, destfile);
	 	
	 	driver.close();
	 
	}

}
