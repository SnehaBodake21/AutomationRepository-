package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		//stop the execution for 2 sec
		Thread.sleep(2000);
		//take the address of current window or browser
		//parent browser ...(the browser or window has controls)
		String ParentHandle=driver.getWindowHandle();
		System.out.println("address of parent browser or window "+ParentHandle);
		//stop execution for 2 sec
		Thread.sleep(2000);
		//click on open pop window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//get the address of parent as well as child browser
		Set<String> allHandles = driver.getWindowHandles();
		//print address of browser use  for each loop
		for (String wh : allHandles) {
			
			if (!ParentHandle.equals(wh)) {
				
				System.out.println("address of child window"+wh);
				
			}
			else {
				System.out.println("address of parent window"+wh);
				
			}
			
		}
		driver.quit();
	}

}
