package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public void excelWrite(int sheetno, int rowval, int cellval, String data) throws IOException {
		
		
		FileInputStream load = new FileInputStream("C:\\Users\\admin\\Desktop\\Sunil\\trial.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		
		FileOutputStream writeoutput = new FileOutputStream("C:\\Users\\admin\\Desktop\\Sunil\\trial.xlsx");
		
		sheet1.createRow(rowval).createCell(cellval).setCellValue(data);
		
		workbook.write(writeoutput);
		
	}

	public void excelread(int sheetno, int rowval, int cellval) throws IOException {
		
		FileInputStream load =  new FileInputStream("C:\\Users\\admin\\Desktop\\Sunil\\trial.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
   
	XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		
	String data = sheet1.getRow(rowval).getCell(cellval).getStringCellValue();
	
	System.out.println(data);
			
		
		
	}
	
}
