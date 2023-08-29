package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP1 {
	
	// TC1 : How to insert zeroth row and zeroth column in excel

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX1.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		
		r =xsh.createRow(0);
		r.createCell(0).setCellValue("Kavi");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX1.xlsx");
		xwb.write(fos);
		

	}

}
