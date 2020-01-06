package oc.ja.prac;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

public class customizedSerialization implements Serializable {

	public static final long serialVersionUID = 34567899876543345L;

	private String firstName;
	private String lastName;
	private int accountNumber;
	private Date dateOpened;

	public customizedSerialization(String firstName, String lastName, int accountNumber, Date dateOpened) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.dateOpened = dateOpened;
	}

	public customizedSerialization() {
		super();
	}

	// This is for serialization
	private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {

		firstName = aInputStream.readUTF();
		lastName = aInputStream.readUTF();
		accountNumber = aInputStream.readInt();
		dateOpened = new Date(aInputStream.readLong());

	}

	// This is for deserialization
	private void writeObject(ObjectOutputStream aOutputStream) throws ClassNotFoundException, IOException {

		aOutputStream.writeUTF(firstName);
		aOutputStream.writeUTF(lastName);
		aOutputStream.writeInt(accountNumber);
		aOutputStream.writeLong(dateOpened.getTime());
		System.out.println("This is deser");
	}

}
