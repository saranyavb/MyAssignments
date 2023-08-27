package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Launch the url:https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
				
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Click Try It Button
//			 *Hint*
					//Switch to the frame
			driver.switchTo().frame("iframeResult");
			//Then click Try It with xpath
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			Thread.sleep(3000);
			//Switch to the alert and Enter your name in alert box
			Alert alert = driver.switchTo().alert();
			//Click OK/Cancel in the alert
			//Then perform accept / dismiss
			alert.accept();
			//Confirm the action is performed correctly by verifying the text !!
			 
		
			String text = driver.findElement(By.id("demo")).getText();
			
		System.out.println(text);
		

		
		
		
		
		
	}

}
