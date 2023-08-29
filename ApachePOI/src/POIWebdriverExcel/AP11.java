package POIWebdriverExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AP11 {

		// TC11: Navigate to  www.mercurytravels.co.in
		
		ChromeDriver driver;
		 @BeforeTest
		  public void beforeTest() throws InterruptedException 
		 {
			 System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
		     driver = new ChromeDriver();
		     driver.get("https://www.mercurytravels.co.in/");
		     driver.manage().window().maximize();
		     Thread.sleep(3000);
		  }
		 
		 @Test
		  public void exceloperation() throws IOException {
			  
			    FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX7.xlsx");
				XSSFWorkbook xwb = new XSSFWorkbook(fis);
				XSSFSheet xsh = xwb.getSheet("Sheet1");
				
				Row r;
				
				WebElement dropdown = driver.findElement(By.id("themes"));
				List<WebElement> values = dropdown.findElements(By.tagName("options"));
				
				for(int i =0;i<values.size();i++)
				{
					
					r=xsh.createRow(i);
					r.createCell(0).setCellValue(values.get(i).getText());
				}
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX7.xlsx");
				xwb.write(fos);
		  }
		 
		  @AfterTest
		  public void afterTest() {
			  
			  //driver.close();
		  }

		
}
