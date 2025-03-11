package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     //Click on search button without entering text in search text field
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(2000);
	     
	     //Handle the Alert
	     Alert ale=driver.switchTo().alert();
	     ale.accept();
	     System.out.println("Alert was Handled Successfully");
	     
	     driver.findElement(By.id("Small-searchterms")).sendKeys("alert was handled");//Control came to mainpage
	}

}
