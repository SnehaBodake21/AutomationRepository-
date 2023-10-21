package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch web application
		driver.get("file:///C:/Users/Snehal/Desktop/wcsm9webelemnts/Link.html");
		Thread.sleep(2000);
		
		//identify link by using PartialLinkText
		driver.findElement(By.partialLinkText("seleniumLink")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	
}

}
