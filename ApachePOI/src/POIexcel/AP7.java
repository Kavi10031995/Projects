package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP7 {

	public static void main(String[] args) throws IOException {
		// TC7: How to get the data multiple rows in excel
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		
		for(int i=0;i<=10;i++)
		{
		r =xsh.getRow(i);
		
		String data = r.getCell(0).getStringCellValue();
		System.out.println(data);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		xwb.write(fos);

	}

}
