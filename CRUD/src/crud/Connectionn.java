	package crud;

	import java.sql.Connection;
import java.sql.DriverManager;
	import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

	public class Connectionn {

	public Connection getconnection() throws ClassNotFoundException, SQLException
	{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=null;

			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			if(con!=null)//connection checking 
			{
				return con;
			}
			else {
				System.out.println("check connection");
				return null;
			}
			
		}

	}
