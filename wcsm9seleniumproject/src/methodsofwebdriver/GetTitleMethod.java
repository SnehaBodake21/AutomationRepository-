package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("https://www.flipkart.com/");
		//stop the execution of the script for 2 sec
		Thread.sleep(2000);
		//get the title of the current page
		String titleOfpage=driver.getTitle();
		System.out.println(titleOfpage);
		//close the browser
		driver.close();
	}

}
