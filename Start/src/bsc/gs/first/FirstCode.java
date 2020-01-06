package bsc.gs.first;

public class FirstCode {

	public static void main(String[] args) {
		//int a= 75;
		String name= "Application Running successful";
		
		//String[] args2 = new String[2];
		String[] fruits = {"apple","apple2","apple7"};
		
		
		//args2[args1.length] = name;
		System.out.println("Hello:  "+name);
		for (String fruit: fruits) {
		System.out.println("You are in:  "+fruit);
		}
		
		
		int a=2;
		double b=11.11;
		float c= 23.2f;
		String d= "name";
		char e = '!';
		long f = 12312312312312234l;
		short g = 2;
		boolean j= true;
		byte k= 1;
		
		System.out.println("Integer "+a);
		System.out.println("Double " +b);
		System.out.println("Float "+c);
		System.out.println("String "+d);
		System.out.println("Long "+f);
		System.out.println("Short "+g);
		System.out.println("boolean "+j);
		System.out.println("byte "+k);
		System.out.println("char "+e);
	}

}
