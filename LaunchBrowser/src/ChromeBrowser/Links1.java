package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links1 {

	public static void main(String[] args) throws InterruptedException {
          System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
          ChromeDriver driver =new ChromeDriver();
          
          driver.get("https://www.google.com");
          driver.manage().window().maximize();
          driver.navigate().to("https://www.mercurytravels.co.in");
          Thread.sleep(3000);
          
        //TC3: How to get the list of visible links and invisible links
          
          List<WebElement> links = driver.findElements(By.tagName("a"));
          System.out.println("Total Number of links are:"+links.size());
          
        
          int count =0;
          for(int i=0;i<links.size();i++)
          {
        	  if(links.get(i).isDisplayed())
        	  {
        		  count++;
        	  }
          }
          System.out.println("Total Number of visible links are:" + count);
          System.out.println("Total Number of invisible links are:" + (links.size()-count));
          
          
	}

}
