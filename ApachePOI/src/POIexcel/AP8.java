package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP8 {

	public static void main(String[] args) throws IOException {
		// TC8: How to get the data multiple columns in excel
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		r =xsh.getRow(0);
		
		for(int i=0;i<=10;i++)
		{
		String data = r.getCell(i).getStringCellValue();
		System.out.print(data+"      ");
		}
		System.out.println();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		xwb.write(fos);

	}

}
