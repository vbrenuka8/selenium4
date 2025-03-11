package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_with_Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      WebElement searchtxt=driver.findElement(By.id("small-searchterms"));
	      //Fluent Wait
	      FluentWait wait=new FluentWait(driver);
	      wait.pollingEvery(Duration.ofSeconds(1));
	      wait.withTimeout(Duration.ofSeconds(15));//upper limit
	      wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
	      
	      driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
		  WebElement searchpage=driver.findElement(By.xpath("//h1[@text()='Search']"));
		  wait.pollingEvery(Duration.ofSeconds(1));
		  wait.withTimeout(Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.visibilityOf(searchpage));
		  
		  driver.quit();
	      
	}

}
