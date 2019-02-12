package demo.csvFileUtility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

// incomplete.
public class CSVDemo {

	public static HashMap<String, String> getCSVRow(int rowNumber) {
		// BufferedReader br = null;
		String COMMA_DELIMITER = ",";
		try {

			BufferedReader br = new BufferedReader(new FileReader(".\\CSVFiles\\C2ImportCalEventSample.csv"));

			HashMap<String, String> map = new HashMap<>();

			String line = "";
			int header = 0;
			
			// Reading header
			line = br.readLine();
			
			String[] row = line.split(COMMA_DELIMITER);
			
			int l = 1;
			while ((line = br.readLine()) != null) {
				

				if (l == rowNumber) {
					String[] row1 = line.split(COMMA_DELIMITER);

					if (row1.length >= 0) {
						int i = 0;
						for (String cell : row) {
							map.put(row[i].trim().toLowerCase(), row1[i].trim().toLowerCase());
							//System.out.println("row[" + i + "]=" + row[i]);
							//System.out.println("row1[" + i + "]=" + row1[i]);
							i++;
						}
						return map;
					}
					break;
				}
				l++;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}
	
	public static String getCSVDataByHeader(String key, int rowNumber)
	{
		HashMap<String, String> map1 = new HashMap<>();
		map1 = getCSVRow(rowNumber);
		return map1.get(key.trim().toLowerCase());
	}

	public static void main(String[] args) {

		/*HashMap<String, String> map = new HashMap<>();
		map = getCSVRow(1);
		System.out.println("All Day Event = " + map.get("All Day Event"));
		System.out.println("Event Title = " + map.get("Event Title"));*/

		
		System.out.println("All Day Event = " + getCSVDataByHeader("All Day Event", 1));
		System.out.println("Event Title = " + getCSVDataByHeader("Event Title", 1));
		System.out.println("All Day Event = " + getCSVDataByHeader("All Day Event", 2));
		System.out.println("Event Title = " + getCSVDataByHeader("Event Title", 2));


	}

}
