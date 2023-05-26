package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_colSizeInARow
{
   public static void main(String[] args)
   {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://cosmocode.io/automation-practice-webtable/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  int colSize = driver.findElements(By.xpath("(//table[@id='countries']//tr)[2]//td")).size();
	  System.out.println(colSize);
}
}
