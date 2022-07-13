package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("C:\\Selenium\\selenium1\\excel1.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mySheet = book.getSheet("Sheet1");
		Row myRow = mySheet.getRow(3);
		Cell myCell = myRow.getCell(1);
		System.out.println(myCell.getCellType());
		System.out.println("==================================");

	}

}
