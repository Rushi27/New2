package handlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	  
	  //step 1
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
	  //Step 2
	  Actions act=new Actions(driver);
	  
	  //step 3
	  act.click(month).perform();
	  Thread.sleep(2000);
	  
	  //step 4A: navigate 1 option to top using "Arrow_up" key
	  act.sendKeys(Keys.ARROW_UP).perform();
	  Thread.sleep(1000);
	  act.sendKeys(Keys.ARROW_UP).perform();
	  Thread.sleep(1000);
	  
	  //step 4B: navigate 1 option to bottom using "Arrow_Down" key
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  Thread.sleep(1000);
	  
	  //step 4C: select option using "Enter" key
	  act.sendKeys(Keys.ENTER).perform();
}
}
