package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize chrome browser
		driver.manage().window().maximize();
		//to launch webApllication
		Navigation nav = driver.navigate();
		nav.to("https://selenium.dev");
		Thread.sleep(2000);
		//to perform backword operation
		nav.back();
		Thread.sleep(2000);
		//to perform forward operation
		nav.forward();
		Thread.sleep(2000);
		//to perform refresh operation
		nav.refresh();
		driver.close();
		
		
		
		
	}

}
