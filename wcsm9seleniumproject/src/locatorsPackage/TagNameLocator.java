package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Snehal/Desktop/wcsm9webelemnts/Simplelogin.html");
	
		
		Thread.sleep(2000);
		//identify usernameTB and pass input AS "admin"
		driver.findElement(By.tagName("input")).sendKeys("admin");
		//identify passwordTB and pass input AS "manager"
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");
		Thread.sleep(2000);
		driver.close();
	}

}
