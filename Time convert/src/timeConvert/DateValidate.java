package timeConvert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
//import java.time.format.ResolverStyle;

public class DateValidate {

	public static boolean test(final String date) {
		boolean valid = false;
		try {
			LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mma z").withResolverStyle(ResolverStyle.SMART));
			valid = true;
			
		} catch (DateTimeParseException e) {
			e.printStackTrace();
			valid = false;
		}
		
		return valid;
	}

}
