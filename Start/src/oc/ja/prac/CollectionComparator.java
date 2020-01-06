package oc.ja.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionComparator {

	public static void main(String[] args) {

		List banks = new ArrayList();
		Collections.addAll(banks, "Citi", "CIBC", "SBI");
		banks.forEach(System.out::println);

		Collections.sort(banks);
		System.out.println("Sorted according to natural ordering:");
		banks.forEach(System.out::println);

		Collections.sort(banks, Comparator.reverseOrder());
		System.out.println("Sorted according to reverse of natural ordering:");
		banks.forEach(System.out::println);
	}
}
