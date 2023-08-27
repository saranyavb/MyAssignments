package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Task3 {

	public static void main(String[] args) throws InterruptedException {
		// Delete Lead:
		ChromeDriver driver = new ChromeDriver();
		// Launch the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// to maximize window size
		driver.manage().window().maximize();
		// username and password
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		// click on crm/sfa link
		driver.findElement(By.xpath("//div[@id='label']//a")).click();
		Thread.sleep(2000);
		// lead button click
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click Find leads
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// 9 Enter phone number
		// driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("669");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2167799");
//			10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 11 Capture lead ID of First Resulting lead
		Thread.sleep(3000);
	String leadid = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).getText();
	System.out.println(leadid);
		// 12 Click First Resulting lead
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		// 13 Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		// 14 Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		// 15 Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		// 16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 17 Verify message "No records to display" in the Lead List. This message
		String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(message);
		// confirms the successful deletion
		// 18 Close the browser (Do not log out)
	Thread.sleep(2000);
		driver.close();
		
		
	

}
}

