package demo.text.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



class FileUtility
{
	FileInputStream in = null;
	FileOutputStream out = null;
	int flag=0;
	
	public int CopyFile(String sourceFile, String destnationFile) throws IOException
	{
		
		try {
			File sf_obj = new File(sourceFile);
			File df_obj = new File(destnationFile);
			in = new FileInputStream(sf_obj);
			out = new FileOutputStream(df_obj);
			
			int c;
			while((c=in.read()) != -1)
			{
				System.out.println(c);
				out.write(c);
				flag=1;
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}
		
		
		return 0;
		
	}
}

public class OneCopyFiles {

	public static void main(String[] args) throws IOException {
		//D:\Eclipse\Java-Practics_workspace\ProjectsPractices\src\ExcelFile
		String sfile="D:\\Eclipse\\Java-Practics_workspace\\ProjectsPractices\\src\\demo\\text\\fileOperations\\sourcefile.txt";
		String dfile ="D:\\Eclipse\\Java-Practics_workspace\\ProjectsPractices\\src\\demo\\text\\fileOperations\\destinationFile.txt";
		
		FileUtility fu = new FileUtility();
		fu.CopyFile(sfile, dfile);
		
		File f=new File(sfile);
		System.out.println("gap=" + f.getAbsolutePath());
		System.out.println("exists = " + f.exists());
				
		
	}
}
