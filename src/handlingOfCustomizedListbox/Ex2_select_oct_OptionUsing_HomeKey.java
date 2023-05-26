package handlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_select_oct_OptionUsing_HomeKey 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	  
	  //step 1:
	  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	  
	  //step 2:
	  Actions act=new Actions(driver);
	  
	  //step 3:
	  act.click(month).perform();
	  
	  //navigate to 1st option using "Home" key
	  act.sendKeys(Keys.HOME).perform();
	  Thread.sleep(1000);
	  
	  //step to navigate to OCT option using "Arrow_Down" key
	  for(int i=1; i<=9; i++)
	  {
		  act.sendKeys(Keys.ARROW_DOWN).perform();
		  Thread.sleep(500);
	  }
	  
	  //select option using enter key
	  act.sendKeys(Keys.ENTER).perform();
	  
}
}
