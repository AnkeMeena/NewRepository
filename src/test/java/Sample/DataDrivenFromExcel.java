package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDrivenFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\meena\\OneDrive\\Documents\\Admin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c=wb.getSheet("Admin").getRow(0).getCell(1);
		DataFormatter df=new DataFormatter();
		String value = df.formatCellValue(c);
		System.out.println(value);

	}

}
