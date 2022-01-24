package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Eclipse\\eclipse-workspace\\MavenTest\\Excelfilles\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("sheet1");
int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println(physicalNumberOfRows);



for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
	
	Row row = sheet.getRow(i);
	
	
	
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell2 = row.getCell(j);
		int cellType = cell2.getCellType();
		if (cellType==1)
		{
		String stringCellValue1 = cell2.getStringCellValue();
		System.out.print(" "+stringCellValue1);

		}	
		else {
double numericCellValue = cell2.getNumericCellValue();
long l=(long) numericCellValue;	
String valueOf = String.valueOf(l);
System.out.println(" "+valueOf);
		
		}
		
}
System.out.println();
}
	}

}	
	
