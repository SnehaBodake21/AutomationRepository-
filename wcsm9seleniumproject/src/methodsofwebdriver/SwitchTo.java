package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		
		//launch chrome browser
		 WebDriver driver = new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
		 Thread.sleep(2000);
		 //switch control to active elements
		 driver.switchTo().activeElement().sendKeys("selenium" , Keys.ENTER);
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
	}

}
