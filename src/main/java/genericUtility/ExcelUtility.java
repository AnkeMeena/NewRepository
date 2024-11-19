package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.security.auth.login.AccountException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String SheetName,int RowNum,int CellNum)throws Exception {
	FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
	Workbook wb=WorkbookFactory.create(fis);
	Cell c=wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum);
	DataFormatter df=new DataFormatter();
	String Value=df.formatCellValue(c);
	System.out.println(Value);
	return Value;
  }
	public String getMultipleDataFromExcel(String SheetName,int StratRowIndex,int StartCellIndex)throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		System.out.println(sh.getLastRowNum());
		DataFormatter df=new DataFormatter();
		for(int i=StratRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row r=sh.getRow(i);
			for(int j=StartCellIndex;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.println(value);
			}
		}
		return SheetName;
		
	}
	public void WriteDataToExcel(String SheetName,int rowIndex,int CellIndex,String value)throws Exception
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		sh.createRow(rowIndex).createCell(CellIndex).setCellValue(value);
		sh.getRow(1).createCell(1).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(IPathConstant.excelPath);
		wb.write(fos);
		
		
		
	}
}
