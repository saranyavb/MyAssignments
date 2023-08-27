package week4assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {

		// Pseudo Code

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		// * 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// * 5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// * 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		// * 7. Click on Widget of From Contact
		driver.findElement(By.xpath("//input[@name='partyIdFrom']/following::img")).click();
		Set<String> FromContactwindow = driver.getWindowHandles();
		System.out.println(FromContactwindow.size());

		List<String> newtab = new ArrayList<String>(FromContactwindow);
		driver.switchTo().window(newtab.get(1));
		// * 8. Click on First Resulting Contact
		driver.findElement(
				By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"))
				.click();

		// * 9. Click on Widget of To Contact
		driver.switchTo().window(newtab.get(0));
		driver.findElement(By.xpath("(//input[@name='partyIdFrom']/following::img)[2]")).click();
		Set<String> ToContactwindow = driver.getWindowHandles();
		System.out.println(ToContactwindow.size());
		List<String>nexttab=new ArrayList<String>(ToContactwindow);
		driver.switchTo().window(nexttab.get(1));
		// * 10. Click on Second Resulting Contact
		driver.findElement(
				By.xpath	("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[2]")).click();
		// * 11. Click on Merge button using Xpath Locator
		driver.switchTo().window(newtab.get(0));
		driver.findElement(
				By.xpath	("//a[text()='Merge']")).click();
		Thread.sleep(2000);
		// * 12. Accept the Alert
Alert alert = driver.switchTo().alert();
alert.accept();
		// * 13. Verify the title of the page
String title = driver.getTitle();
System.out.println(title);
	}

}

