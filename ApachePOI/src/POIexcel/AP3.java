package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP3 {

	public static void main(String[] args) throws IOException {
		//TC3: How to modify the exisiting data into required data
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX2.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		
		r =xsh.createRow(0);
		r.createCell(3).setCellValue("KaviChangedData");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX2.xlsx");
		xwb.write(fos);

	}

}
