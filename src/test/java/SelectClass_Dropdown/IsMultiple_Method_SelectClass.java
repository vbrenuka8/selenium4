package SelectClass_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_Method_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //click on books link
	       driver.findElement(By.partialLinkText("Books")).click();
	       //sort by dropdown
	       WebElement sort_by=driver.findElement(By.id("products-orderby"));
	       Select objsel=new Select(sort_by);
	       System.out.println(objsel.isMultiple());

	}

}
