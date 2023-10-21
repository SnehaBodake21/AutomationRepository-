package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("http://desktop-1j990kh/login.do");
		//take the source code of login page
		String loginpagesourcecode=driver.getPageSource();
		System.out.println(loginpagesourcecode);
		//stop execution for 2 sec
		Thread.sleep(2000);
		driver.quit();
	}

}
