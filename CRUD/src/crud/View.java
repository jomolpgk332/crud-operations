package crud;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class View {
	Connectionn con=new Connectionn();
	public void viw() throws SQLException, ClassNotFoundException {
		
		PreparedStatement st=(PreparedStatement)con.getconnection().prepareStatement("insert into stud(sid,uname,pswd)values(?,?,?)");
		ResultSet set=st.executeQuery("select * from stud"); 
		while(set.next()) {
			//to display the values
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3));
		}
		
		Firstapp first=new Firstapp();
		first.choice();
		
	}

}
