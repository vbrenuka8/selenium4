package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AirIndia_App_DateDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions options=new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     
	       WebDriver driver=new ChromeDriver(options);
	       driver.get("https://www.airindia.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	       
	       driver.findElement(By.xpath("//button[text( )='Accept All']")).click();
	       driver.findElement(By.id("dpFromDate_label")).click();
	       WebElement ele=driver.findElement(By.xpath("//select[@title='month-dropdown']"));
	       Select obj=new Select(ele);
	       obj.selectByVisibleText("Apr 2025");
	       driver.findElement(By.xpath("//div[@aria-label='Monday, April 14, 2025']")).click();

	}

}
// WebElement sort=driver.findElement(By.id("products-orderby"));
//Select objsel=new Select(sort);
//objsel.selectByVisibleText("Price: High to Low");
