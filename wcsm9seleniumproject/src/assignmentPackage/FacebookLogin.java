package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		//identify username TB by using id
		driver.findElement(By.id("email")).sendKeys("snehalbodake");
		Thread.sleep(2000);
		
		//identify password TB by using id
		driver.findElement(By.id("pass")).sendKeys("manager");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
