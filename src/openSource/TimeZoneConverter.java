package openSource;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneConverter {

	public static void main(String[] args) {

		TimeZoneConverter tzc = new TimeZoneConverter();
		//tzc.getCurrentSystemDate();
		//tzc.getCurrentTimeZone();
		
		tzc.convertTime();
	}

	/*public LocalTime timeFromSourceToTargetZone(LocalTime time,TimeZone sTimeZone, TimeZone tTimeZone)
	{
		time=LocalTime.now(EST);
		return tTime;
		
	}*/
	public void timeZoneConverter() {

	}

	public Date getCurrentSystemDate() {
		Date date = new Date();
		return date;
	}

	public void getCurrentTimeZone() {
		Calendar c = Calendar.getInstance();

		// get current TimeZone using
		TimeZone tz = c.getTimeZone();

		System.out.println("Current TimeZone is : " + tz.getDisplayName());

	}

	// exp-1
	public void convertTime() {
		Calendar localTime = Calendar.getInstance();

		int hour = localTime.get(Calendar.HOUR);
		int minute = localTime.get(Calendar.MINUTE);
		int second = localTime.get(Calendar.SECOND);
		int year = localTime.get(Calendar.YEAR);

		// Print the local time
		System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);

		// Create a calendar object for representing a Singapore time zone.
		Calendar indiaTime = new GregorianCalendar(TimeZone.getTimeZone("Asia/Singapore"));
		indiaTime.setTimeInMillis(localTime.getTimeInMillis());
		hour = indiaTime.get(Calendar.HOUR);
		minute = indiaTime.get(Calendar.MINUTE);
		second = indiaTime.get(Calendar.SECOND);
		year = indiaTime.get(Calendar.YEAR);

		// Print the local time in Germany time zone
		System.out.printf("India time: %02d:%02d:%02d %02d\n", hour, minute, second, year);

		// Here are all list of timezones for your reference
		log(TimeZone.getAvailableIDs());
	}

	private void log(String[] availableIDs) {
		System.out.println("\nHere are all list of timezones for your reference:");
		for (String temp : availableIDs) {
			System.out.println(temp);
		}
	}
}
