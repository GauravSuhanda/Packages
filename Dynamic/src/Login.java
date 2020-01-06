

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String name =  request.getParameter("name");
		String pass =  request.getParameter("pass");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection
			("jdbc:oracle:thin:@10.10.9.49:1521:SIR12164","CITI_AMWS_DEV163_22NOV16","CITI_AMWS_DEV163_22NOV16");
			Statement stmt= (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select name,pass from test123 where name='"+name+"' and pass='"+pass+"'");
			
			if(rs.next()) {
				response.sendRedirect("http://localhost:8080/loginDemo/WelcomeUser.jsp?name="+rs.getString("name"));
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				//response.sendRedirect("Welcome.jsp");
			}
			else {
				out.println("Wrong id and password");
			}
			
			
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
