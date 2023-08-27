package ChromeBrowser;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		
                 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
                 
                 ChromeDriver driver = new ChromeDriver();
                 driver.get("https://www.google.com");
                 //driver.navigate().to("https://www.bing.com");
                 driver.navigate().to("https://www.mercurytravels.co.in/");
                 driver.manage().window().maximize();
                 Thread.sleep(3000);
                 
                // TC1: navigate to mercurytravels.co.in and get the list of links
                 
                List<WebElement> links = driver.findElements(By.tagName("a"));
                
                System.out.println(links.size());
                
                // TC2: How to get the names of the links
                
                for(int i =0;i<links.size();i++)
                {
                	System.out.println(links.get(i).getText());
                }
                 
	}

}
