package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// Launch the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// to maximize window size
		driver.manage().window().maximize();
		// username and password
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// clicl on link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// lead button click
		driver.findElement(By.linkText("Leads")).click();
		// create lead click
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name, first name, last name,firstname
		// local,department,deascription, email
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Velu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sara");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing how to create");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ranyavelu@gmail.com");
		// create
		driver.findElement(By.className("smallSubmit")).click();
		// browser level verification
		String title = driver.getTitle();
		System.out.println("title");
	}

}
