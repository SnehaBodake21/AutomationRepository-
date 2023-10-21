package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogpost {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		//close only parent browser
		driver.close();
		//close all browser
		driver.quit();
		
	}

}
