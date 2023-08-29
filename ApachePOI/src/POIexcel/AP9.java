package POIexcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AP9 {

	public static void main(String[] args) throws IOException {
		// TC9: How to get the data multiple columns and multiple rows in excel
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsh = xwb.getSheet("Sheet1");
		
		Row r;
		int rcount = xsh.getLastRowNum();
		
		for(int i=0;i<rcount;i++)
		{
			r =xsh.getRow(i);
			int ccount = r.getLastCellNum();
			for(int j=0;j<ccount;j++)
			{
				System.out.print(r.getCell(j).getStringCellValue()+"    ");	
			}
			System.out.println();
		}
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KAVIPRIYA S\\Downloads\\Excel\\EX5.xlsx");
		xwb.write(fos);

	}

}
