package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	public static void main(String[] args) {
		
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before format:  " + myDateTime);
		
		DateTimeFormatter myDateFormat = 
			DateTimeFormatter.ofPattern("dd-mm-yyyy  HH:mm:ss");
		String modDateTime = myDateTime.format(myDateFormat);
		System.out.println("After format:  " + modDateTime);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dateStr = "26/04/2023";
		LocalDate date = LocalDate.parse(dateStr,format);
		System.out.println(date);
	}

}
