package crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class Update {
	
	Scanner s=new Scanner(System.in);
	public void upd() throws ClassNotFoundException, SQLException {
		Connectionn con=new Connectionn();
		System.out.println("enter the  id to update");
		int id1=s.nextInt();
		System.out.println("enter the new userid");
		int id=s.nextInt();
		System.out.println("enter the new name");
		String name=s.next();
		System.out.println("enter the new password");
		String pwd=s.next();
		PreparedStatement st=con.getconnection().prepareStatement("update stud set sid=?,uname=?, pswd=?where sid=?");
		st.setInt(1,id);
		st.setString(2, name);
		st.setString(3, pwd);
		st.setInt(4,id1);
		st.executeUpdate();
		System.out.println("updated successfully");
		Firstapp first=new Firstapp();
		first.choice();
		
		
	}

}
