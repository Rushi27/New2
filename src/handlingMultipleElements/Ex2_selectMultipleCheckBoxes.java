package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_selectMultipleCheckBoxes 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver=new ChromeDriver();
	  driver.get("C:\\\\Users\\\\hp\\\\Documents\\\\Zoom\\\\multipleCheckbox.html");
	  
	  List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	  
	  System.out.println(allCheckBoxes.size());
	  
	//select checkboxes
	  for(WebElement s1:allCheckBoxes)
	  {
		  s1.click();
		  Thread.sleep(500);
	  }
	  
//	  select checkboxes
//	  for(int i=0; i<=allCheckBoxes.size(); i++)
//	  {
//		  allCheckBoxes.get(i).click();
//	  }
	  
	  //deselect checkboxes
	  for(int i=allCheckBoxes.size()-1; i>=0; i--)
	  {
		  allCheckBoxes.get(i).click();
		  Thread.sleep(500);
	  }
}
}
