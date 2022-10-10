package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public  class Excelutil {

	
	public static String Excel (int rowindex , int coloumnindex) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\304962\\eclipse-workspace\\Practic\\Excel\\Book1.xlsx");
		
            Workbook book  = WorkbookFactory.create(file);
            
        org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet("Sheet1");
             
                      String value =  sheet.getRow(rowindex).getCell(coloumnindex).getStringCellValue();
    
            	return value;
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
