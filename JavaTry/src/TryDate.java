import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TryDate {
	public static void main(String[] args) throws ParseException{
		Date date = new Date();   // given date
		Calendar calendar = Calendar.getInstance(); // creates a new calendar instance
		calendar.setTime(date);   // assigns calendar to given date 
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // gets hour in 24h format
		calendar.get(Calendar.HOUR);        // gets hour in 12h format
		calendar.get(Calendar.MONTH); 
		
		String string1 = "20:11:13";
	    Date time1 = new SimpleDateFormat("HH:mm:ss").parse(string1);
	    Calendar calendar1 = Calendar.getInstance();
	    calendar1.setTime(time1);
	    System.out.println(calendar1.get(Calendar.HOUR_OF_DAY)); // gets hour in 24h format
	    System.out.println(time1.getHours());

	}
}
