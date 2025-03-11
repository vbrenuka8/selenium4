package Actions_Class_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ScrollBYAmount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action =new Actions(driver);
	      //for vertical scroll
	      action.scrollByAmount(0, 500).perform();
	      Thread.sleep(2000);
	      //for horizontal scroll
	      action.scrollByAmount(500, 0).perform();
	      Thread.sleep(2000);
	      driver.quit();
	}

}
