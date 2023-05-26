package scrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  Thread.sleep(2000);
	  
	  WebElement ele1 = driver.findElement(By.xpath("//a[text()='Contact Us']"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
	  
	  Thread.sleep(2000);
	  
	  WebElement ele2 = driver.findElement(By.xpath("//div[text()='Mobiles']"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
}
}
