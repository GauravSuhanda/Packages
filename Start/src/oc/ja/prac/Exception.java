package oc.ja.prac;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try {
			testException(5);
			// testException(-5); //Negative will create File not found exceptions
			// testException(-10);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Out of Exceptions Code successful");
		}
		testException(9);
		// testException(15); //This is will call IOException

	}

	public static void testException(int i) throws FileNotFoundException, IOException {
		if (i < 0) {
			FileNotFoundException myexp = new FileNotFoundException("Negative int " + i);
			throw myexp;
		} else if (i > 10) {
			throw new IOException("Only support index 0 to 10");
		}
	}

}
