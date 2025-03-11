package Actions_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold_Method_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action=new Actions(driver);
	      WebElement washington=driver.findElement(By.id("box3"));
	      WebElement united_states=driver.findElement(By.id("box103"));
	      Thread.sleep(1000);
	      action.clickAndHold(washington).moveToElement(united_states).click().perform();
	      
	}

}
