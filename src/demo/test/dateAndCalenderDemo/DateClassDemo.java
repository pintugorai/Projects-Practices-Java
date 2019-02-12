package demo.test.dateAndCalenderDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println("date = " + d.toString());
		
		// Print date in your own format
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy");
		//sdf.format(d);
		
		System.out.println(sdf.format(d));
		
		// google it to get all the date format
	}

}
