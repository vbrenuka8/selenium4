package Working_with_WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	     driver.get("");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	}

}
