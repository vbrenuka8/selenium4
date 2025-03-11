package SelectClass_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //click on books link
	       driver.findElement(By.partialLinkText("Books")).click();
	       Thread.sleep(2000);
	       //sort by Dropdown
	       WebElement sort=driver.findElement(By.id("products-orderby"));
	       Select objsel=new Select(sort);
	       objsel.selectByVisibleText("Price: High to Low");
	       Thread.sleep(1000);
	       //Display dropdown
	       WebElement display=driver.findElement(By.id("products-pagesize"));
	       Select objsel1=new Select(display);
	       objsel1.selectByVisibleText("12");
	       Thread.sleep(2000);
	       //View as Dropdown
	       WebElement view=driver.findElement(By.id("products-viewmode"));
	       Select objsel2=new Select(view);
	       objsel2.selectByIndex(1);
	       
	}

}
