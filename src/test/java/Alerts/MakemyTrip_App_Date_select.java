package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemyTrip_App_Date_select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   		
		   WebDriver driver=new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	       
	       driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	       WebElement ele=driver.findElement(By.id("departure"));
	       Actions act=new Actions(driver);
	       act.doubleClick(ele).perform();
	       WebElement ele1=driver.findElement(By.xpath("//div[text( )='March 2025']/ancestor::div[@class='DayPicker-Month']/descendant::p[text( )='23']"));
	       act.doubleClick(ele1).perform();
	
	}

}
