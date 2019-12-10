package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Delete {
	public void del() throws ClassNotFoundException, SQLException  {
		Connectionn con=new Connectionn();

		Scanner s=new Scanner(System.in);
		System.out.println("id to be deleted");
		int id=s.nextInt();
		PreparedStatement st=con.getconnection().prepareStatement("delete from stud where sid=?");
		st.setInt(1,id);
		st.executeUpdate();
		System.out.println("id deleted");
		Firstapp first=new Firstapp();
		first.choice();
		
		
	

}
}
