package handlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getRatingFromFlipkart 
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
       
       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
       
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
       
       String rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
       System.out.println(rating);
		
	}
}
