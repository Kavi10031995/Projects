package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.mercurytravels.co.in/");
	       driver.manage().window().maximize();
	       
	       //driver.navigate().to("https://www.bing.com");
	       //driver.navigate().to("https://www.mercurytravels.co.in/");
	       
	       Thread.sleep(3000);
	       
	       // Tagname for dropdown: select

	       // Tagname for values inside the dropdown : option
	       
	       //  TC4: How to count no. of values from a particular dropdown
	       
	       WebElement dropdown = driver.findElement(By.id("themes"));
	       
	       List<WebElement> values = dropdown.findElements(By.tagName("option"));
	       System.out.println("total number of values inside the particular dropdowns are :"+  values.size());
	       
	       // TC5: How to get the names of all values inside the particular dropdown 
	       
	       for(int i=0;i<values.size();i++)
	       {
	    	   System.out.println(values.get(i).getText());
	       }
	        

	}

}
