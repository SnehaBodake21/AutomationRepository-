package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
	       WebDriver driver = new ChromeDriver();	
	       Thread.sleep(2000);
		//handle properties of browser such as
		//maximize
		//minimize
		//full screen
		//set size
		//set position
		                                                                                               
		    //maximize the browser
	       //driver.manage().window().maximize();
	        //minimize the browser
	       //driver.manage().window().minimize();
	           //full screen the browser
	           //driver.manage().window().fullscreen();
	       //set the size of browser
	        Dimension targetsize = new Dimension(350, 450);
	        driver.manage().window().setSize(targetsize);
	        Thread.sleep(2000);
	        //set the position of browser
	        Point targetposition = new Point(450, 250);
	        driver.manage().window().setPosition(targetposition);
	        Thread.sleep(2000);
	        //close the browser
	        driver.close();
	        
	       
	       
	
	}

}
