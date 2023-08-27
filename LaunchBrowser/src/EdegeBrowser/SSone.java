package EdegeBrowser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SSone {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.edge.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\msedgedriver.exe" );
        WebDriver driver1 = new EdgeDriver();
        
        driver1.get("https://www.google.com");
        driver1.manage().window().maximize();
        Thread.sleep(3000);
        
        //TC1: navigate to google.com and capture the screenshot
        
        File ss =((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File("C:\\Users\\KAVIPRIYA S\\OneDrive\\Desktop\\Image.PNG"));
	}

}
