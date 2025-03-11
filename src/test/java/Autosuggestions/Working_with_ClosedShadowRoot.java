package Autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ClosedShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     //Login Attached Text
	     driver.findElement(By.xpath("//h1[text( )='Login']")).click();
	     Actions action=new Actions(driver);
	     action.sendKeys(Keys.TAB).perform();
	     Thread.sleep(1000);
	     action.sendKeys("Priam").perform();
	     Thread.sleep(1000);
	     action.sendKeys(Keys.TAB).perform();
	     Thread.sleep(1000);
	     action.sendKeys("Harish").perform();
	     Thread.sleep(1000);
	     
	     

	}

}
