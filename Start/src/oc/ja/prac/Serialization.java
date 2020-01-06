package oc.ja.prac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Citi implements Serializable {
	int i;
	int j;

	Citi(int i, int j) {
		this.i = i;
		this.j = j;
	}

}

public class Serialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		// fileoutput stream opens a kind off gateway to object op and then transfer to
		// storage
		Citi d1 = new Citi(10, 20);
		FileOutputStream fos = new FileOutputStream("asd.txt");// Serialization
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println(d1.toString());
		oos.writeObject(d1);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("asd.txt");// de serialization
		ObjectInputStream ois = new ObjectInputStream(fis);
		Citi d2 = (Citi) ois.readObject();
		System.out.println("Hellow");
		System.out.print("..output.. " + d2.i + "--" + d2.j);
		ois.close();
		fis.close();
	}
}
