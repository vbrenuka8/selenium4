package SelectClass_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //click on books link
	       driver.findElement(By.partialLinkText("Books")).click();
	       //sort by dropdown
	       WebElement sort=driver.findElement(By.id("products-orderby"));
	       Select objsel=new Select(sort);
	       //getOptions Method
	       List<WebElement> sortby_values=objsel.getOptions();
	       //Iterate on the list to print the values/getText
	       for(WebElement value:sortby_values)
	       {
	    	   System.out.println(value.getText());
	       }
	       //display dropdown
	       WebElement display=driver.findElement(By.id("products-pagesize"));
	       Select objsel1=new Select(display);
	       //getOptions Method
	       List<WebElement> display_values=objsel1.getOptions();
	       //Iterate on the list to print the values/getText
	       for(WebElement value1:display_values)
	       {
	    	   System.out.println(display.getText());
	       }
	     //view dropdown
	       WebElement view=driver.findElement(By.id("products-viewmode"));
	       Select objsel2=new Select(view);
	       //getOptions Method
	       List<WebElement> view_values=objsel2.getOptions();
	       //Iterate on the list to print the values/getText
	       for(WebElement value2:view_values)
	       {
	    	   System.out.println(view.getText());
	       }
	}

}

