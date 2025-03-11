package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      
	      driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.id("small-searchterms")).sendKeys("computers");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	     driver.quit();
	}

}
