package EdegeBrowser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("Webdriver.edge.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
         WebDriver driver1 = new EdgeDriver();
         
         driver1.get("https://www.bing.com");
         driver1.manage().window().maximize();
         Thread.sleep(3000);
         
         List<WebElement> link = driver1.findElements(By.tagName("a"));
         System.out.println(link.size());
         
         for(int i =0;i<link.size();i++)
         {
        	 if(link.get(i).isDisplayed())
        	 {
        		 String Name = link.get(i).getText();
        		 link.get(i).click();
        		 
        		 File SS =((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        		 FileUtils.copyFile(SS, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\SS1\\"+ Name +".png"));
        		 
        		 driver1.navigate().back();
        		 link = driver1.findElements(By.tagName("a"));
        		 
        	 }
         }
	}

}
