package ActionsClass_KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      Actions action =new Actions(driver);
	     WebElement searchtextfield=driver.findElement(By.id("small-searchterms"));
	     action.moveToElement(searchtextfield).click().sendKeys("mobiles").perform();
	}

}
