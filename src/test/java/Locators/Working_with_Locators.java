package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //Name Locator
	       WebElement searchfield=driver.findElement(By.name("q"));
	       searchfield.sendKeys("mobiles");
	       //ID Locator
	       driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	       //Link Text Locator
	}

}
