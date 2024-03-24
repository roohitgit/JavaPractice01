package practice_codes2;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;
public class FindDifferenceBetweenTwoDates {

	public static void main(String[] args) {
	
		
		LocalDateTime d1 = LocalDateTime.of(2024, 02, 24, 10, 0, 0);
		LocalDateTime d2 = LocalDateTime.of(2024, 03, 24, 10, 0, 0);
		
		Duration duration = Duration.between(d1, d2);
		System.out.println(duration.getSeconds());
		
		LocalDate d3 = LocalDate.of(2023, 02, 21);
		LocalDate d4 = LocalDate.of(2024, 03, 24);
		Period period = Period.between(d3, d4);
		System.out.println("Number of days "+period.getDays());
		System.out.println("Number of months "+period.getMonths());
		System.out.println("Number of years "+period.getYears());
	}

}
