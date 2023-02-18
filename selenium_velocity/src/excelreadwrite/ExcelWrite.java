package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		
		File path = new File("C:\\Users\\admin\\Desktop\\Sunil\\trial.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		FileOutputStream writeoutput = new FileOutputStream(path);
		
		sheet1.createRow(3).createCell(2).setCellValue("automation");
		
		workbook.write(writeoutput);
		
	}

}
