package HtmlUD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class linkspgm {

	public static void main(String[] args) throws InterruptedException {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();

		driver.get("https://www.mercurytravels.co.in/");
        driver.manage().window().maximize();
        //driver.navigate().to("https://www.bing.com");
        //driver.navigate().to("https://www.mercurytravels.co.in/");
        Thread.sleep(10000);
      
       // TC4: navigate to mercurytravals.co.in and get the name of every link along with its url
        
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
	   
	   for(int i =0;i<links.size();i++)
	   {
		   if(links.get(i).isDisplayed())
		   {
			   String name = links.get(i).getText();
			   links.get(i).click();
			   
			   String url = driver.getCurrentUrl();
			   System.out.println(name +"  "+ url);
			   
			   driver.navigate().back();
			   links = driver.findElements(By.tagName("a"));
			   
		   }
	   }
	}

}
