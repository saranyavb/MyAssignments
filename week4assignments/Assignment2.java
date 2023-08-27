package week4assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Load https://buythevalue.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// 2. Click on first product (eg: Hamdard Hing - 50GM)
		driver.findElement(By.xpath("(//div[@class='owl-item active']//a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> childtab = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childtab.get(0));
		// 3. Enter the pincode
		WebElement zipcode = driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']"));
		zipcode.sendKeys("600072");
		// 4. Click on Check

		driver.findElement(By.xpath("//input[@value='Check']")).click();

		// 5. Click on ADD TO CART
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();

		// 6. Click on View
		Thread.sleep(2000);

		WebElement viewButton = driver.findElement(By.xpath("(//p[@class='success-message show-cart']//span)"));

		driver.executeScript("arguments[0].click();", viewButton);

		// 7. Click on CHECK OUT
		driver.findElement(By.xpath("//div[@class='cart-buttons inner-right inner-left']//input[@id='checkout']")).click();
		
		Thread.sleep(2000);
//			//Handle alert
		Alert alert = driver.switchTo().alert();

//			//8. Accept the alert
		alert.accept();
	}

}
