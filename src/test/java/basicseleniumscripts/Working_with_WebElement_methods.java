package basicseleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebElement_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://demowebshop.tricentis.com/");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
       
	}

}
