package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linksss {

	public static void main(String[] args) throws InterruptedException {
		
              System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
              WebDriver driver1 = new EdgeDriver();
              
              driver1.get("https://www.google.com");
              driver1.navigate().to("https://www.bing.com");
              //driver1.navigate().to("https://www.mercurytravels.co.in/");
              driver1.manage().window().maximize();
              Thread.sleep(3000);
              
              // TC1: navigate to www.bing.com  and get the list of links
              
              List<WebElement> links = driver1.findElements(By.tagName("a"));
              System.out.println("Total Number of links are :" + links.size());
            
             
              // TC2: How to get the names of the links
              
               for(int i =0;i<links.size();i++)
               {
            	   System.out.println("Names of links are :" + links.get(i).getText());
               }
              
              
	}

}
