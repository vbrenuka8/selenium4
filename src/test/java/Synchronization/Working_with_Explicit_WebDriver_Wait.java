package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Explicit_WebDriver_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      //Thread.sleep(2000);
	      WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	      //WebDriver wait is nothing but Explicit wait
	      //create an object for WebdriverWait class
	      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	      wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	      
	      driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      //Thread.sleep(2000);
	      
	     WebElement searchpage=driver.findElement(By.xpath("//h1[@text()='Search']"));
	     //Synchronization point for search text
	     wait.until(ExpectedConditions.visibilityOf(searchpage));
	     
	     driver.quit();
	}

}
