package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_RedBus_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.redbus.in/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
       
       driver.findElement(By.id("bus_tickets_vertical")).click();
       driver.findElement(By.id("src")).sendKeys("Bangalore");
       driver.findElement(By.id("dest")).sendKeys("Dharwad");
       driver.findElement(By.xpath("//span[text( )='Date']")).click();
       driver.findElement(By.xpath("//span[text( )='21']")).click();
       driver.findElement(By.xpath("//button[text( )='SEARCH BUSES']")).click();
       driver.close();
       
	}

}
