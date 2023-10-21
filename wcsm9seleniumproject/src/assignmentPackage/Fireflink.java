package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		
		//identify username TB by using id
		driver.findElement(By.id("mui-1")).sendKeys("Snehal@gmail.com");
		Thread.sleep(2000);
		
		//identify password TB by using id
		driver.findElement(By.id("mui-2")).sendKeys("admin");
		Thread.sleep(2000);	
		driver.close();
		
	}

}
