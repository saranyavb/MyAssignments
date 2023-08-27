package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		// clicl on link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		// lead button click
		driver.findElement(By.linkText("Leads")).click();
		// create lead click
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name, first name, last name,firstname
		// local,department,deascription, email
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("boobalan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test2");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing how to create");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ranyavelu@gmail.com");
		// create
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		//browser validate
		String page = driver.getTitle();
		//edit
		driver.findElement(By.linkText("Edit")).click();
		//Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//fill important notes
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("update validation");
		//update
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		// browser level verification
				String title = driver.getTitle();
				System.out.println("title");
	}

}
