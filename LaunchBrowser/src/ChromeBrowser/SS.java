package ChromeBrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("Webdriver.chrome.driver", "‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.mercurytravels.co.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 //TC1: navigate to mercurytravels.com and capture the screenshot
		 
		 File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(ss,new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\Image.PNG"));
	}

}
