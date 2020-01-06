package bsc.gs.first;



/////////////////////////////////////////////////////////
////////Parameterized Constructor   //////////////////
////////////////////////////////////////////////////////


/*public class Constructors {
		
	int empId;
	String empName;

	
	Constructors(int id, String name){
		System.out.println("Welcome");
		this.empId = id;
		this.empName =  name;
		
	}
	void info() {
		System.out.println("Id:"+empId+" Name: "+empName);
	}
	
	public static void main(String[] args) {
		Constructors obj1= new Constructors(001, "Tester1");
		Constructors obj2= new Constructors(002, "Tester2");
		obj1.info();
		obj2.info();
		
	}
}*/


/////////////////////////////////////////////////////////
////////   Parameterized Constructor   //////////////////
////////////////////////////////////////////////////////



public class Constructors{
	
	private int var;
	
	public Constructors()
	{
		this.var = 10;
	}
	
	public Constructors(int num)
	{
		this.var= num;
	}
	
	public int getValue()
	{
		return var;
	}	
	
	public static void main(String[] args) {
		
		Constructors obj = new Constructors();
		Constructors obj2 = new Constructors(100);
		System.out.println("var is: "+obj.getValue());
		System.out.println("var is: "+obj2.getValue());
	}
}