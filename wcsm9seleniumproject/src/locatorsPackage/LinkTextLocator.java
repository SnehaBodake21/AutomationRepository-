package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Snehal/Desktop/wcsm9webelemnts/Link.html");
		Thread.sleep(2000);
		
		//identify link by using LinkText
		driver.findElement(By.linkText("seleniumLink")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
