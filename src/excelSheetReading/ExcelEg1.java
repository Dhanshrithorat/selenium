package excelSheetReading;

import java.io.File;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("C:\\Selenium\\selenium1\\excel1.xlsx");
		Workbook book = WorkbookFactory.create(myfile);	
String name =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(name);
	double number =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
						System.out.println(number);
	String mychar =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
				System.out.println(mychar);
	WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
			//System.out.println(myValue);
						
	}

}
