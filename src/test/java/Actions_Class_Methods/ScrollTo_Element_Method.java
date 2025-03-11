package Actions_Class_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTo_Element_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action =new Actions(driver);
	      WebElement myaccount=driver.findElement(By.linkText("My account"));
	      action.scrollToElement(myaccount).perform();
	      Thread.sleep(2000);
	      driver.quit();
	}

}
