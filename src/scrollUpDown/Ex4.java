package scrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://cosmocode.io/automation-practice-webtable/");
	  
	  Thread.sleep(1000);
	  
	   WebElement ele1 = driver.findElement(By.xpath("//strong[text()='Zimbabwe']"));
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
}
}
