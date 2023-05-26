package handlingAutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");

	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmi");
	 Thread.sleep(2000);

	 List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	 
	 String expText="redmi";
	 
	 for(WebElement a1:allOptions)
	 {
		 String actText = a1.getText();
		 if(actText.equals(expText))
		 {
			 a1.click();
			 break;
		 }
		 
	 }
}
}
