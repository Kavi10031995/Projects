package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP6 {

	public static void main(String[] args) throws IOException {
		//TC6:How to get the data from excel zeroth row and zeroth column
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX1.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		r =xsh.getRow(0);
		
		String data = r.getCell(0).getStringCellValue();
		System.out.println(data);
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX1.xlsx");
		xwb.write(fos);

	}

}
