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

public class BKFSSS {

	public static void main(String[] args) throws InterruptedException, IOException {
            
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
		 
		 driver1.get("https://www.moneycontrol.com");
		 driver1.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 //TC3: navigate to moneycontrol and search for BKFS link, 
		 // if that link is available than click on it, 
		 // if it is not available take a screenshot as a proof
		 
		 List<WebElement> links = driver1.findElements(By.linkText("BKFS"));
		 
		 if(links.size()==0)
		 {
			 File ss =((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(ss, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\BKFSNOT.PNG"));
		 }
		 else
		 {
			 links.get(0).click();
		 }
		
	}

}
