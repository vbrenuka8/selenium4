package Working_with_WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     String parentwindow=driver.getWindowHandle();
	     
	     driver.findElement(By.linkText("Facebook")).click();
	     Thread.sleep(3000);
	     
	     Set<String> childwindows=driver.getWindowHandles();
	     
	     for(String window:childwindows)
	     {
	    	driver.switchTo().window(window);
	    	if(driver.getTitle().contains("Facebok"))
	    	{
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("priam@gmail.com");
	    	  Thread.sleep(2000);
	    	  driver.close();
	    	}
	    }
	     driver.switchTo().window(parentwindow);
	     Thread.sleep(2000);
	     driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(2000);
	     driver.close();
	}

}
