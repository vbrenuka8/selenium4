package basicseleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_findElements_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //get all the links on the Webpage
	       List<WebElement> links=driver.findElements(By.xpath("//a"));
	       //Iterate over the collection of links
	       for(int i=0; i<=links.size()-1; i++)
	       {
	    	   String linktext=links.get(i).getText();
	    	   System.out.println(linktext);
	       }
	       
	}

}
