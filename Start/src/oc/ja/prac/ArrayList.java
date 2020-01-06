package oc.ja.prac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {

		/*
		 * List<String> birds = new java.util.ArrayList<>(); birds.add("hawk"); //
		 * [hawk] birds.add("hawk"); // [hawk, hawk]
		 * System.out.println(birds.remove("cardinal")); // prints false
		 * System.out.println(birds.remove("hawk")); // prints true
		 */
		/*
		 * List<String> one = new java.util.ArrayList<>(); List<String> two = new
		 * java.util.ArrayList<>(); System.out.println(one.equals(two)); // true
		 * one.add("a"); // [a] System.out.println(one.equals(two)); // false
		 * two.add("a"); // [a] System.out.println(one.equals(two)); // true
		 * one.add("b"); // [a,b] two.add(0, "b"); // [b,a]
		 * System.out.println(one.equals(two)); // false
		 */
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		// If we use wrapper class and import Arrays. We don't use java.util.Arrays
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array)
			System.out.println(b + " "); // new test
		// list.remove(1); // throws UnsupportedOperation Exception

		// LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		// LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		System.out.println("Manipulating Dates and Times");
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30

		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		date2.plusDays(10);// here data = date.plusDays(10);
		System.out.println(date2);
	}
}
