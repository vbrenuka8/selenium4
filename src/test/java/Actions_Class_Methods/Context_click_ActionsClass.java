package Actions_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context_click_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action=new Actions(driver);
	      //contextClick Right Click
	      WebElement rightclick_button=driver.findElement(By.xpath("//span[contains(text( ),'right')]"));
	      action.contextClick(rightclick_button).build().perform();
	      Thread.sleep(1000);
	      action.moveToElement(driver.findElement(By.xpath("//span[text( )='Copy']"))).click().perform();      
	      
	}

}
