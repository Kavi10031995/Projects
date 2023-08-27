package ChromeBrowser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.bing.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 System.out.println(link.size());
		 
		 for(int i =0;i<link.size();i++)
		 {
			 if(link.get(i).isDisplayed())
			 {
				 
			 String Name = link.get(i).getText();
			 link.get(i).click();
			 
			 File SS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(SS, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\SS\\"+ Name +".png")); 
			 
			 driver.navigate().back();
			 
			 link = driver.findElements(By.tagName("a"));
			 }
			 
		 }
		 

	}

}
