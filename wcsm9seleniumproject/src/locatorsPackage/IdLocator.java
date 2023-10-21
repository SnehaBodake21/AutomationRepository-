package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("file:///C:/Users/Snehal/Desktop/wcsm9webelemnts/Simplelogin.html");
		 Thread.sleep(2000);
		 
		 //identify username TB by using id
		 driver.findElement(By.id("id1")).sendKeys("admin");
		 Thread.sleep(2000);
		 
		 //identify password TB by using id
		 driver.findElement(By.id("id2")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.close();
		 
		 
		 
		 
	}

}
