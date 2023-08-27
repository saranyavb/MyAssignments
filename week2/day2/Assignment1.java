package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and set the path

		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Test");
		// Step 8: Enter the last name
		WebElement firstname = driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input"));
		firstname.sendKeys("saranya");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input"))
				.sendKeys("9677196122");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("12345");
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select dayvalue = new Select(day);
		dayvalue.selectByValue("9");
		WebElement month = driver.findElement(By.id("month"));
		Select monthvalue = new Select(month);
		monthvalue.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.id("year"));
		Select yearvalue = new Select(year);
		yearvalue.selectByVisibleText("1990");
		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		// ( A normal click will do for this step)

	}

}
