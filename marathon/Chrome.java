package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Chrome {

	public static void main(String[] args) throws InterruptedException {
	//	01) Launch Chrome  
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
	   //  add  implicitlyWait 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//03) Type "Bags" in the Search box
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
	//04) Choose the 	 item in the result (bags for boys)
	     driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
	//05) Print the total number of results (like 50000)    1-48 of over 50,000 results for "bags for boys"
	String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	System.out.println(result);
	//06) Select the first 2 brands in the left menu(like American Tourister, Generic)
	WebElement brand1 = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]"));
	driver.executeScript("arguments[0].click();", brand1);
	
	WebElement brand2 = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]"));
	driver.executeScript("arguments[0].click();", brand2);
	
		Thread.sleep(2000);
	//07) Choose New Arrivals (Sort)
	driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	
	//08) Print the first resulting bag info (name, discounted price)
	String name = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']")).getText();
	System.out.println(name);
	String discountprice = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']")).getText();
	System.out.println(discountprice);
	//09) Get the page title and close the browser(driver.close())	
	
	

	}

}
