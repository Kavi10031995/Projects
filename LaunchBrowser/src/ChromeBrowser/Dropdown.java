package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe" );
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.mercurytravels.co.in/");
       driver.manage().window().maximize();
       
       //driver.navigate().to("https://www.bing.com");
       //driver.navigate().to("https://www.mercurytravels.co.in/");
       
       Thread.sleep(3000);
       
      // Tagname for dropdown: select

      // Tagname for values inside the dropdown : option
       
      // TC1: Naviagte to mercurytravels.co.in and get the list of dropdowns
       
       List<WebElement> dropdown = driver.findElements(By.tagName("select"));
       
       System.out.println("Total Number of Dropdowns:" + dropdown.size());
       
       // TC2: How to get the names of all the dropdowns 
       
       for(int i=0;i<dropdown.size();i++)
       {
    	   System.out.println(dropdown.get(i).getAttribute("name"));
       }
       
      // TC3: navigate to mercurytravels.co.in and go to type of holiday dropdown and select "Family" value from the dropdown
       
       driver.findElement(By.id("duration_d")).sendKeys("10Nights+11Days");
       driver.findElement(By.id("themes")).sendKeys("Family");
       
       
	}
	

	
}
