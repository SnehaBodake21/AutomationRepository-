package assignmentPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspost {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//close only parent browser
		//driver.close();
		//close all browser
		//driver.quit();
		
		String current_window = driver.getWindowHandle();
		Set<String>all_Windows = driver.getWindowHandles();
		Iterator<String> i = all_Windows.iterator();
		while(i.hasNext()) {
			String child_window = i.next();
			if(!child_window.equalsIgnoreCase(current_window)) {
				driver.switchTo().window(child_window);
				System.out.println("The current window is " +child_window);
				//close method closes the child window
				driver.close();
			}
				else {
					System.out.println("No other window open");
			}
		
		}
		driver.close();
    }
} 

