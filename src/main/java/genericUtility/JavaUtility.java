package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method to fetch the calendar details in the provided pattern
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern)
	{
		Calendar cal = Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
		
		
	}
	/**
	 * this is generic method to generate random number
	 * @param bound
	 * @return
	 */
	public int getRandomNumber(int bound) {
		Random r=new Random();
		int num = r.nextInt();
		return num;
		
	}
	

}
