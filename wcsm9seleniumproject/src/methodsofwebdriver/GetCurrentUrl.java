package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
     public static void main(String[] args) throws InterruptedException {
    	 //launch the chrome browser
    	 WebDriver driver = new ChromeDriver();
    	 //maximize the browser
    	 driver.manage().window().maximize();
    	 //launch the webapplication
    	 driver.get("http://desktop-1j990kh/login.do");
    	 //take url of login page
    	 String urlofloginpage=driver.getCurrentUrl();
    	 System.out.println( urlofloginpage);
    	 //stop the execution of script for 2 sec
    	 Thread.sleep(2000);
    	 driver.close();
    	 
	
}
}
