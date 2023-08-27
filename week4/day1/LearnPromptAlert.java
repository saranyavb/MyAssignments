package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		// Launch the url
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//to change driver to alert
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("saranya");
		
		Thread.sleep(600);
		alert.accept();

	}
}