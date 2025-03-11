package Actions_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Method_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action=new Actions(driver);
	      //Double click button
	      WebElement button=driver.findElement(By.xpath("//button[contains(text( ),'Double')]"));
	      action.doubleClick(button).build().perform();
	}

}
