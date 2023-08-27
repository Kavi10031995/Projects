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

public class SSBKFS {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.moneycontrol.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 //TC3: navigate to moneycontrol and search for BKFS link, 
		 // if that link is available than click on it, 
		 // if it is not available take a screenshot as a proof
		 
		 List<WebElement> links =  driver.findElements(By.linkText("BKFS"));
		 
		 if(links.size()==0)
		 { 
			 File SS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(SS, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\BKFSNOTFOUND.PNG")); 
		 }
		 else
		 {
			 links.get(0).click();
		 }	 

	}

	
	}


