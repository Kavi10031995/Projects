package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.mercurytravels.co.in/");
	       driver.manage().window().maximize();
	       
	       //driver.navigate().to("https://www.bing.com");
	       //driver.navigate().to("https://www.mercurytravels.co.in/");
	       
	       Thread.sleep(3000);
	      
	       // TC6: navigate to mercurytravels.co.in and go to type of holiday dropdown and search for one particular value like "Family"

	       // if Family is available :"pass"

	       // if "Family" is not available:"Fail"
	       
	       WebElement dropdown = driver.findElement(By.id("themes"));
	       
	       List<WebElement> values = dropdown.findElements(By.tagName("option"));
	       
	       System.out.println("total number of values inside the particular dropdowns are :"+  values.size());
	       
	       for(int i=0;i<values.size();i++)
	       {
	    	   String Actual = values.get(i).getText();
	    	   values.get(i).click();
	    	   
	    	   String Expected = "Family";
	    	   
	    	   if(Actual.equals(Expected))
	    	   {
	    		   System.out.println("Pass");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Fail");
	    	   }
	       }
	       
	       
	       
	       
	       
	       
		
	}

}
