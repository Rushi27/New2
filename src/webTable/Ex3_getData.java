package webTable;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex3_getData 
{
   public static void main(String[] args) 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://cosmocode.io/automation-practice-webtable/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 String data = driver.findElement(By.xpath("((//table[@id='countries']//tr)[2]//td)[2]")).getText();
	 System.out.println(data);
}
}
