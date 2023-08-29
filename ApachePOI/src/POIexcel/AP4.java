package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP4 {

	public static void main(String[] args) throws IOException {
		//TC4:How to insert the data in multiple rows and zeroth coulmn
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX3.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0;i<=10;i++)
		{
		r =xsh.createRow(i);
		r.createCell(0).setCellValue("KaviPriya");
		}
	
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX3.xlsx");
		xwb.write(fos);

	}

}
