package basicseleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_maximize_minimize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.co.in");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         driver.manage().window().minimize();
         Thread.sleep(2000);
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.close();
	}
}
