package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) throws InterruptedException {
		// 1. Load https://erail.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");

		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE");

		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("buttonFromTo")).click();

		WebElement table = driver.findElement(
				By.xpath("//table[contains(@class='TrainList ')]/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		List<WebElement> column = table.findElements(By.tagName("td"));
		System.out.println(column.size());
		System.out.println("Train names in this route");
		for (int i = 2; i < row.size(); i++) {
			String text = driver.findElement(By.xpath(
					"//table[contains(@class='TrainList')]/tbody/tr[+i+]/td[2]"))
					.getText();
			

			System.out.println(text);
		}
	}
}
