package Autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_On_Shadowing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     //Inspect shadow root element
	     driver.findElement(By.xpath("//section[contains(text( ),'Shadow')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//section[contains(text( ),'Shadow')])[2]")).click();
	     Thread.sleep(1000);
	     
	     //Shadow host-->Identify shadow host
	     SearchContext shadow_host=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
	     shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("Priam");
	     Thread.sleep(2000);
	     
	     //Shadow host--> for Password
	     SearchContext shadow_host_psw=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
	     shadow_host_psw.findElement(By.cssSelector("input[type='text']")).sendKeys("Harish");
	     Thread.sleep(2000);
	     
	     
	}

}
