package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg_tag_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
       Thread.sleep(2000);
       driver.close();
	}

}
