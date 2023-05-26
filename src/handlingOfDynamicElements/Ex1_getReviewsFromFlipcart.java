package handlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getReviewsFromFlipcart 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  
	  Thread.sleep(1000);
	  //Enter mobile name
	  driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Redmi note 10 pro max");
	  
	  Thread.sleep(1000);
	  //click on search button
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  
	  //get reviews
	  String review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
	  System.out.println(review);
}
}
