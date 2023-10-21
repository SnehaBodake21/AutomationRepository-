package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
	     //launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//stop the execution for 2 sec
		Thread.sleep(2000);
		//take the address of current window or browser
		//parent browser...(the browser or window has controls)
		String ParentHandle=driver.getWindowHandle();
		System.out.println(ParentHandle);
		driver.close();

	}

}
