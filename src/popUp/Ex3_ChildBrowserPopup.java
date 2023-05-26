package popUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_ChildBrowserPopup 
{
   public static void main(String[] args) throws InterruptedException 
   {
      WebDriver driver=new ChromeDriver();
      driver.get("https://skpatro.github.io/demo/links/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      //click on "New Tab" from main page
      driver.findElement(By.xpath("//input[@value='New Tab']")).click();
      
      //Get Child Window ID
      Set<String> AllIDs = driver.getWindowHandles();
     
      ArrayList<String> al=new ArrayList<String>(AllIDs);    //{MainPageID(0) , ChildWindowID(1) }
      String childWindowID = al.get(1);
      
      //Switch to child window
      driver.switchTo().window(childWindowID);
      
      //click on "training" link from chlid window
      driver.findElement(By.xpath("//span[text()='Training']")).click();
      
      Thread.sleep(3000);
      
      //switch to main page
      driver.switchTo().window(al.get(0));
      
      Thread.sleep(3000);
      
      //click on "New Window" from main Page
      driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
      
      
      
      
      
      
      
      
      
}
}
