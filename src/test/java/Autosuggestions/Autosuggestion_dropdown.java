package Autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.id("small-searchterms")).sendKeys("compu");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();
	}

}
