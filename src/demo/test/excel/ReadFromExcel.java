package demo.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	
	public static void main(String[] arg) throws FileNotFoundException {
		
	
		File myfile= new File("D:\\Knowledge based\\MyJava\\temp\\Business.xlsx");
		
		//load file as form of bytes
		FileInputStream fis = new FileInputStream(myfile);
		
		try {
			// Load workbook
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			// Load first sheet
			XSSFSheet sheet0= workbook.getSheetAt(0);
			
			// Read cell - 00
			String cell00 = sheet0.getRow(0).getCell(0).toString();
			
			System.out.println("Cell-00 = " + cell00);
			
			workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
