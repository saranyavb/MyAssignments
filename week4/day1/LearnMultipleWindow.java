package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleWindow {

	public static void main(String[] args) {
		//Load https://www.irctc.co.in/
		ChromeDriver driver = new ChromeDriver();
		
				
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	2. Click on FLIGHTS link  
			 driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			 Set<String> windowHandles = driver.getWindowHandles();
			 System.out.println(windowHandles.size());
			 //convert to list
			 List<String> childwindow=new ArrayList<String>( windowHandles);
			
		//	3. Get the title (filghts window -AirTicket )
			 driver.switchTo().window(childwindow.get(1));
			 System.out.println(driver.getTitle());
		//	4. Close the First tab(Train ticket booking) alone
	driver.switchTo().window(childwindow.get(0));
	driver.close();
	}
}
