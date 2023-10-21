package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch chrome browser we need create obj of ChromeDriver();
		
	      WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome is open!!");
		//stop the execution of script for 4 sec
		Thread.sleep(4000);
		
	     //How to close chrome browser
		driver.close();
	    System.out.println("Chrome is close!!");
		
	}

}
