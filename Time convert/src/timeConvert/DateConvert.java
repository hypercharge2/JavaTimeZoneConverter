package timeConvert;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateConvert {
	public static String convert(final String date, final String tz) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mma z");
		String postconvert = null;
		
		ZonedDateTime outdate = null;
		outdate = ZonedDateTime.parse(date, df);
		
		ZoneId convertto = TimeGet.getZone(tz);
		ZonedDateTime test = outdate.withZoneSameInstant(convertto);
		System.out.println(test);
		postconvert = df.format(test);
		System.out.println(postconvert);
		return postconvert;
	}
}
