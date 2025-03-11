package Actions_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Method_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action=new Actions(driver);
	      //source WebElement
	      WebElement source=driver.findElement(By.id("box3"));
	      //Target WebElement
	      WebElement target=driver.findElement(By.id("box103"));
	      action.dragAndDrop(source, target).build().perform();
	      Thread.sleep(2000);
	      //source WebElement
	      WebElement rome=driver.findElement(By.id("box6")); 
	      WebElement italy=driver.findElement(By.id("box106"));
	      action.dragAndDrop(rome, italy).build().perform();
	}

}
