package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		// 1. Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		// 2. Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input"))
				.sendKeys("kumar.testleaf@gmail.com");
		// 3. Enter Password as "leaf@12"
		driver.findElement(By.xpath("//label[contains(text(),'Password')]/following-sibling::input"))
				.sendKeys("leaf@12");
		// 4. Click login button
		driver.findElement(By.xpath("//form[@method='POST']/button")).click();
		// 5. Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("title");
		// 6. Click on Log Out
		driver.findElement(By.xpath("//input[@type='hidden']/following::a")).click();
		// 7. Close the browser (use -driver.close())

		Thread.sleep(2000);
		driver.close();

	}

}
