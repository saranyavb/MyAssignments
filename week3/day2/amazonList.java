package week3.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonList {

	public static void main(String[] args) {
		//Go to https://amazon.in
		
			

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Type phones -> id: twotabsearchtextbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.xpath("//div[@aria-label='phone']")).click();
		
		//Print price of every phone -> class: a-price-whole//span[@class='a-price-whole']
		
		/*List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println(price.size());
		
		for( int i=0;i<price.size();i++)
		{
			String Pricevalue=price.get(i).getText();
		
			System.out.println(Pricevalue);
	}*/

        List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        Set<String> phonevalue=new LinkedHashSet<String>();
      for(int i=0;i<phones.size();i++) {
            String text = phones.get(i).getText();
          /*  System.out.println(text);*/  // list o/p
            phonevalue.add(text);  //set o/p
            
        }    
        
     /*   if(phones.size()==phonevalue.size()) {
            System.out.println("No Duplicates");
        }
        else{
            System.out.println("Duplicates found");
        }
        */
        
        System.out.println(phonevalue);        
}
}
