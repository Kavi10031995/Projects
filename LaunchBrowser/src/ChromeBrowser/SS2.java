package ChromeBrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		
		//TC2: navigate to google.com and capture the screenshot and click on gmail link and capture screenshot
        
        File  SS1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SS1, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\google.PNG"));
        
        driver.findElement(By.linkText("Gmail")).click();
        
        File SS2 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SS2, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\gmail.PNG"));
        
	}

}
