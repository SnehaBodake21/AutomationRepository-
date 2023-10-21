package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch edge browser we need to create obj of EdgeDriver();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("Edge is open");
		//stop the execution of script for 4 sec
		Thread.sleep(4000);
		
		//how to close Edge browser
		driver.close();
		System.out.println("Edge is close");
	}

}
