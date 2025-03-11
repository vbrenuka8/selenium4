package basicseleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_methods_radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //get all the radio buttons
	       List<WebElement>radio_button=driver.findElements(By.xpath("//input[@type='radio']"));
	       //Iterate
	       for(WebElement element:radio_button)
	       {
	    	   Thread.sleep(1000);
	    	   element.click();
	    	   System.out.println(element.isSelected());
	       }
	       
	}

}

