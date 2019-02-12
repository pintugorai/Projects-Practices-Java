package demo.test.SaturdaySunday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class XlxsOperations {

	public static void main(String[] args) throws FileNotFoundException{
		
		File myfile = new File("D:\\Eclipse\\Java-Practics_workspace\\ProjectsPractices\\src\\ExcelFile\\Business.xlsx");
		
		FileInputStream fis = new FileInputStream(myfile);
		
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet0 = workbook.getSheetAt(0);
			
			String cell00 =sheet0.getRow(0).getCell(0).toString();
			
			System.out.println(cell00);
			
			int rn= sheet0.getLastRowNum();
			
			for(int i=0;i<rn;i++)
			{
				for(int j=0;j<sheet0.getRow(0).getLastCellNum();j++) {
					System.out.print(sheet0.getRow(i).getCell(j) + " ");
					}
				System.out.println();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
		
	}
}
