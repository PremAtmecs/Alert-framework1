package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.annotations.VisibleForTesting;

public class Xlsheetmethods {
	
	public String getXLsheet() {
		Locatorinputs locator =new Locatorinputs();
		FileInputStream fs=null;
		try {
			 fs = new FileInputStream("C:\\Users\\premkumar.sarathi\\Desktop\\alertWB.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook=null;
		try {
			workbook=new XSSFWorkbook(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		int rowcount=sheet.getLastRowNum();
		int cellcount=row.getLastCellNum();
		for(int rows=0;rows<rowcount;rows++) {
			for(int cells=0;cells<cellcount;cells++) {
//				if(sheet.getRow(rows).getCell(cells).getStringCellValue().equals(locator.getreqrow())) {
//					
//				}
				if(sheet.getRow(rows).getCell(cells).getStringCellValue().equals(locator.getreqrow())) {
					for(int row1=0;row1<rowcount;row1++) {
						for(int cell1=0;cell1<cellcount;cell1++) {
							System.out.println(sheet.getRow(rows).getCell(cell1).getStringCellValue());
							String alert=sheet.getRow(rows).getCell(cell1).getStringCellValue();
							return alert;
						}
					}
				}
			}
		}
		return null;
		
	}
	
	
	

}
