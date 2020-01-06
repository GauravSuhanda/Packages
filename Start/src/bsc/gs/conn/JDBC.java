package bsc.gs.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBC {

	public static void main(String[] args) {

			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con= DriverManager.getConnection
				("jdbc:oracle:thin:@10.10.9.49:1521:SIR12164","CITI_AMWS_DEV163_22NOV16","CITI_AMWS_DEV163_22NOV16");
				Statement stmt= con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from Test123");
				while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				con.close();
			
			}
			catch(Exception e)
			{
			System.out.println("Exception occured: "+e);	
			}
		System.out.println("hello");
	}

}
