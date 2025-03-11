package Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_with_PushNotifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions class
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		 WebDriver driver=new ChromeDriver(options);
	     driver.get("https://www.easemytrip.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     
	}

}
