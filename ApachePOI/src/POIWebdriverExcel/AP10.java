package POIWebdriverExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AP10 {
	// TC10: Navigate to www.google.com and get the gmail link info and place it in the zeroth row and zeroth column of excel
	
	ChromeDriver driver;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException 
	 {
		 System.setProperty("Webdriver.chrome.driver","‪C:\\Users\\KAVIPRIYA S\\Downloads\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	  }

  @Test
  public void exceloperation() throws IOException {
	  
	    FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX6.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		String data = driver.findElement(By.linkText("Gmail")).getText();
		r =xsh.createRow(0);
		r.createCell(0).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX6.xlsx");
		xwb.write(fos);
  }
 
  @AfterTest
  public void afterTest() {
	  
	  //driver.close();
  }

}
