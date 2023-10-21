package methodsofwebdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver= new ChromeDriver();
		//Maximize the chrome browser
		driver.manage().window().maximize();
		//Launch the webapplication
		driver.get("https://www.primevideo.com/");
		//stop the execution of script for 2 sec
		Thread.sleep(2000);
		//close the chrome browser
		driver.close();
		
	}

}
