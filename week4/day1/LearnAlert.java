package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Launch the url
		driver.get("https://www.leafground.com/alert.xhtml");
		// to maximize window size
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
	//To handle the alert- focus of drivet  to alert box	
Alert alert = driver.switchTo().alert();
 //To accept--ok button
alert.accept();
//to cancel and get value in alert
driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
String text = alert.getText();
System.out.println(text);
alert.dismiss();

	}

}
