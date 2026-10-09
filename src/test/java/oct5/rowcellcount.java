package oct5;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class rowcellcount {
	public static void main(String[] args) throws Throwable{
		//read path of excel file
		FileInputStream fi = new FileInputStream("D:/myfile.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//get first row from Emp sheet
		XSSFRow row = ws.getRow(0);
		//count no of cells in first row
		int cc = row.getLastCellNum();
		//count no of rows from sheet
		int rc = ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		System.out.println("No of cells in first row are::"+cc);
		wb.close();

	}

}
