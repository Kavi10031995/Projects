package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Images {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://www.mercurytravels.co.in/");
         driver1.manage().window().maximize();
	     //driver.navigate().to("https://www.bing.com");
	     //driver.navigate().to("https://www.mercurytravels.co.in/");
	     Thread.sleep(3000);
	     
	     //tagname: img

	     // TC1: navigate to  "https://www.mercurytravels.co.in/" and get the list of images
	     
	     List<WebElement> Images = driver1.findElements(By.tagName("img"));
	     System.out.println("Total Number of Image is :" + Images.size());
	     
	     // TC2: How to get the src value of all the images
	     
	     for(int i =0;i<Images.size();i++)
	     {
	    	 System.out.println("Src Value of Image is :"+ Images.get(i).getAttribute("src"));
	     }
	     
         
	}
	

}
