package excelreadwrite;

import java.io.IOException;

public class ExecutionClass {
	
	public static void main(String[] args) throws IOException {
		
		ExcelUtility utread = new ExcelUtility();
		utread.excelread(0, 3, 2);
		
		
		
	}

}
			