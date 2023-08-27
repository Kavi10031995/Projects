package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown3 {

	public static void main(String[] args) throws InterruptedException {
             
		System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.mercurytravels.co.in/");
	       driver.manage().window().maximize();
	       
	       //driver.navigate().to("https://www.bing.com");
	       //driver.navigate().to("https://www.mercurytravels.co.in/");
	       
	       Thread.sleep(3000);
		
		//TC7: Check whether all the values are displayed or not..
	       //if it is displayed than print as active along with its name, 
		   //if it is not displayed than print as inactive along with its name
	       
	        WebElement dropdown=driver.findElement(By.name("nights"));
		    
		    List<WebElement>values=dropdown.findElements(By.tagName("option"));
		    
		    System.out.println("total number of values inside the particular dropdowns are :"+ values.size());
		    
				    
		    for(int i=0;i<values.size();i++)
		    {
		    	String name=values.get(i).getText();
		    	values.get(i).click();
		    	
		    	if(values.get(i).isDisplayed())
		    	{
		    		System.out.println(name + ":Active");
		    	}
		    	else 
		    	{
		    		System.out.println(name + ":Inactive");
		    		
		    	}
		    	
		    }
	}

}
