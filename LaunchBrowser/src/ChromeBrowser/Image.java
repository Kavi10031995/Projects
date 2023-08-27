package ChromeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe" );
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.mercurytravels.co.in/");
	       driver.manage().window().maximize();
	       //driver.navigate().to("https://www.bing.com");
	       //driver.navigate().to("https://www.mercurytravels.co.in/");
	       Thread.sleep(3000);
	       
	      //tagname: img

	      // TC1: navigate to  "https://www.mercurytravels.co.in/" and get the list of images
	       
	       List<WebElement>  Image = driver.findElements(By.tagName("img"));
	       System.out.println("Total Number of Images : " + Image.size());
	       
	       // TC2: How to get the src value of all the images
	       
	       for(int i=0;i<Image.size();i++)
	       {
	    	   System.out.println("Src Value of Image is :"+ Image.get(i).getAttribute("src"));
	       }

	}

}
