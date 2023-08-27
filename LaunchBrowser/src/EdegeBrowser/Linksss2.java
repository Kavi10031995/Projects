package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linksss2 {

	public static void main(String[] args) throws InterruptedException {
               System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
               WebDriver driver1 = new EdgeDriver();
               
               driver1.get("https://www.google.com");
               driver1.manage().window().maximize();
              // driver1.navigate().to("https://www.mercurytravels.co.in/");
               driver1.navigate().to("https://www.bing.com");
               Thread.sleep(3000);
               
               //TC4: navigate to mercurytravals.co.in and get the name of every link along with its url
               
              List<WebElement> links = driver1.findElements(By.tagName("a"));
              
              for(int i =0;i<links.size();i++)
              {
            	  String Name = links.get(i).getText();
            	  links.get(i).click();
            	  
            	  String url = driver1.getCurrentUrl();
            	  System.out.println(Name +"  "+ url);
            	  
            	  driver1.navigate().back();
            	  links = driver1.findElements(By.tagName("a"));
              }
             

}
}
