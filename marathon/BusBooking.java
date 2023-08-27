package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class BusBooking {

	public static void main(String[] args) throws InterruptedException {
		//01) Launch Firefox / Chrome and add  implicitlyWait
		ChromeDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//02) Load https://www.abhibus.com/
    driver.get("https://www.abhibus.com/");
    driver.manage().window().maximize();
//03) Click on Bus
    //driver.findElement(By.xpath("//a[text()='Bus'])[1]")).click();
//04) Type "Chennai" in the FROM text box
    driver.findElement(By.id("source")).sendKeys("Chennai");
//05) Click the first option from the pop up box
    driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
//06) Type "Bangalore" in the TO text box
    driver.findElement(By.id("destination")).sendKeys("Bangalore");
//07) Click the first option from the pop up box
    driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
//08) Select tomorrow's date in the Date field
    driver.findElement(By.id("datepicker1")).click();
    driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
//09) Click Search Buses
    driver.findElement(By.xpath("//a[text()='Search']")).click();
//09) Print the name of the first resulting bus (use .getText())
    String resultingBus=driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
 System.out.println(resultingBus);
//10) Choose SLEEPER in the left menu from Bus Type
    driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
//11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
    String seatsAvailable=driver.findElement(By.xpath("//p[@class='noseats AvailSts ng-binding']")).getText();
    System.out.println(seatsAvailable);
//12) Click SelectSeat
    driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
//13) Choose any one Available seat
    driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
//14) Print Seats Selected ,Total Fare
    String seatselected=driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
    System.out.println(seatselected);
    String totalfare=driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
    System.out.println(totalfare);
    Thread.sleep(2000);
//15) Select Boarding Point  and Dropping Point
  //to handle boarding point
  		WebElement boarding = driver.findElement(By.id("boardingpoint_id"));
  		//instatiate 
  		Select BoardingPoint=new Select(boarding);
  		//method
  		BoardingPoint.selectByIndex(3);
  		Thread.sleep(2000);
  	//to handle dropping point
  		WebElement droping = driver.findElement(By.id("droppingpoint_id"));
  		//instatiate 
  		Select dropingPoint=new Select(droping);
  		//method
  		dropingPoint.selectByIndex(3);
  		
  		Thread.sleep(2000);
//16) Get the Title of the page(use .getTitle()
  		String page = driver.getTitle();
  		System.out.println(page);
    //17) Close the browser
  		
  		driver.close();
	}

}
