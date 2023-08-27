package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Task1 {

	public static void main(String[] args) throws InterruptedException {
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
		// Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Click on first resulting lead
		Thread.sleep(5000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='10171']")).click();
		// Verify title of the page
		String Title=driver.getTitle();
	
		// Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New company");
		// Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// Confirm the changed name appears
		 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		// Close the browser (Do not log out)
		
		Thread.sleep(2000);
driver.close();
	}

}
