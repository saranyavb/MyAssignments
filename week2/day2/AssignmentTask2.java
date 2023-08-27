package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTask2 {

	public static void main(String[] args) throws InterruptedException {
		//http://leaftaps.com/opentaps/control/main
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		//11	Capture name of First Resulting lead
		Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String firstlead = driver.findElement(By.xpath("//a[text()='10171']")).getText();
		System.out.println(firstlead);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10171']")).click();
		//13	Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//14	Verify the title as 'Duplicate Lead'
		String Duplicatelead=driver.getTitle();
		System.out.println(Duplicatelead);
		//15	Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//16	Confirm the duplicated lead name is same as captured name
		String link=driver.getTitle();
		System.out.println(link);
		Thread.sleep(2000);
		
		
		//17	Close the browser (Do not log out)
		driver.close();
	
	}

}
