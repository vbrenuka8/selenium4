package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC_App_Date_Inspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     ChromeOptions options=new ChromeOptions();
		     options.addArguments("--disable-notifications");
		
		   WebDriver driver=new ChromeDriver(options);
	       driver.get("https://www.irctc.co.in/nget/train-search");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	       
	       driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
	       driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted']"))
	       .click();
	       //driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).click();
	      // driver.findElement(By.id("p-highlighted-option")).click();
	      // driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Bellary");
	}

}
