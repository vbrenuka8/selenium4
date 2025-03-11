package Working_with_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



public class Relative_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']")))
        //.sendKeys("mobiles");
        //driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
        //driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-2"))).click();
        //Thread.sleep(3000);
       // driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("pollanswers-1"))).click();
        driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
	}

}
