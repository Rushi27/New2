package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HiddenDivisionPopUp 
{
   public static void main(String[] args) 
   {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 
	 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
	 
}
}
