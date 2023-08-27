package EdegeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linksss1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe");
	    WebDriver driver1 = new EdgeDriver();

		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
	    //driver.navigate().to("https://www.mercurytravels.co.in/");
		driver1.navigate().to("https://www.bing.com");
		Thread.sleep(3000);
		
		//TC3: How to get the list of visible links and invisible links
		
		List<WebElement> links = driver1.findElements(By.tagName("a"));
		System.out.println("Total Number of links are :" + links.size());
		
		int count=0;
		
		for(int i =0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				count++;
			}
		}
		
		System.out.println("Total Number of Visible links are :" + count);
		System.out.println("Total Number of Invisible links are :" + (links.size()-count));
			
	}

	
}




