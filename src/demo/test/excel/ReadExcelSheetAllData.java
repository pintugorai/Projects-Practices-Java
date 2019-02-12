package demo.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadExcelSheetAllData {

	public static void main(String[] args) throws FileNotFoundException
	{
		File myfile = new File("D:\\Eclipse\\Java-Practics_workspace\\ProjectsPractices\\src\\ExcelFile\\Business.xlsx");
		
		FileInputStream fis1 = new FileInputStream(myfile);
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(fis1);
			
			XSSFSheet sheet0 = workbook.getSheetAt(0);
			
			int size=sheet0.getLastRowNum();
			
			System.out.println("Sheet name = " + sheet0.getSheetName());
			
			for (int i=0;i<size;i++)
			{
				int column = sheet0.getRow(i).getLastCellNum();
				for (int j=0;j<column; j++)
				{
					String value=sheet0.getRow(i).getCell(j).toString();
					System.out.print(" " + value + " ");
				}
				System.out.println();
			}
			workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
