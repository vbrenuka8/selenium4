package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Confirmation_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("cusid")).sendKeys("6798");
	     driver.findElement(By.name("submit")).click();
	     Thread.sleep(2000);
	     
	     driver.switchTo().alert().dismiss();
	     System.out.println("Alert was handled with dismiss method");
	     Thread.sleep(3000);
	     driver.quit();
	}

}
