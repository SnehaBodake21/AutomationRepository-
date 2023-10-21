package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://affiliate.flipkart.com/login");
		 Thread.sleep(2000);
		 
		 //identify username TB by using id
		 driver.findElement(By.id("inputEmail")).sendKeys("Admin");
		 Thread.sleep(2000);
		 
		 //identify password TB by using id
		 driver.findElement(By.id("inputPassword")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.close();
		 
	}

}
