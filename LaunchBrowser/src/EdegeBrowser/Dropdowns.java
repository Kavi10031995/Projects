package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://www.google.com");
         driver1.manage().window().maximize();
         driver1.navigate().to("https://www.mercurytravels.co.in/");
         //driver1.navigate().to("https://www.bing.com");
         Thread.sleep(3000);
           
         // Tagname for dropdown: select

         // Tagname for values inside the dropdown : option
          
         // TC1: Naviagte to mercurytravels.co.in and get the list of dropdowns
         
         List<WebElement> dropdowns = driver1.findElements(By.tagName("select"));
         
         System.out.println("Total Number of Dropdowns:" + dropdowns.size());
     
         // TC2: How to get the names of all the dropdowns
         
         for(int i=0;i<dropdowns.size();i++)
         {
        	 System.out.println("Names of Dropdowns are :" + dropdowns.get(i).getAttribute("name"));
         }
    
         // TC3: navigate to mercurytravels.co.in and go to type of holiday dropdown and select "Family" value from the dropdown
          
          driver1.findElement(By.id("duration_d")).sendKeys("10Nights+11Days");
          driver1.findElement(By.id("themes")).sendKeys("Family");
          
         
         
         
         
         
         
          
         
	}

}
