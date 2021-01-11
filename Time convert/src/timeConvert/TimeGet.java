package timeConvert;

import java.time.ZoneId;

public class TimeGet {
	public static ZoneId getZone(String input) {
		ZoneId tz = ZoneId.of("America/New_York");;
		switch(input) {
			case "EST":
				tz = ZoneId.of("America/New_York");
				break;
			case "CST":
				tz = ZoneId.of("America/Mexico_City");
				break;
			case "MST":
				tz = ZoneId.of("America/Phoenix");
				break;
			case "PST":
				tz = ZoneId.of("America/Los_Angelas");
				break;
		}
		return tz;
	}
}
