package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumCheck {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Launch the url
		driver.get("https://login.salesforce.com/?locale=in");
		 //to maximize window size
		driver.manage().window().maximize();
		//username and password
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@geagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		
}
}