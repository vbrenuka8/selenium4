package basicseleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_url_title_pagesrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       //get URL
       driver.get("https://www.google.co.in");
       String title=driver.getTitle();
       System.out.println(title);
       String url=driver.getCurrentUrl();
       System.out.println(url);
       String pagesrc=driver.getPageSource();
       System.out.println(pagesrc);
       //driver.close();
       driver.quit();
	}

}
