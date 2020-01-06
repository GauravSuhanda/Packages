package oc.ja.prac;

public class ForEach {

	public static void main(String args[]) {
		/*
		 * int arr[] = { 12, 13, 14, 44 }; int total = 0; for (int i : arr) { total =
		 * total + i; System.out.println(i); } System.out.println("Total: " + total);
		 */

		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("Lisa");
		names.add("Kevin");
		names.add("Roger");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}
		System.out.println("************");
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
	}
}