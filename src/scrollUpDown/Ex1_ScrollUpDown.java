package scrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_ScrollUpDown 
{
    public static void main(String[] args) throws InterruptedException 
    {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	   
	   //Scroll down :-> 1st parameter : 0, 2nd parameter : +ve
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	   
	   Thread.sleep(2000);
	   
	   //Scroll down:-> 1st parameter: 0, 2nd parameter: -ve
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	   
	   Thread.sleep(2000);
	   
//	 //Scroll right:-> 1st parameter: +ve , 2nd parameter: 0
//	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
//	   
//	   Thread.sleep(2000);
//	   
//	 //Scroll left:-> 1st parameter: -ve , 2nd parameter: 0
//	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(-100,0)");
//	   
	}
}
