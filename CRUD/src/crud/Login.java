package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Login {
	Connectionn con=new Connectionn();
	public void log() throws SQLException, ClassNotFoundException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.next();
		System.out.println("Enter the password");
		String pass=s.next();
		int flag=1;
		Statement st=con.getconnection().createStatement();
		ResultSet set=st.executeQuery("select * from stud"); 
		
		while(set.next()) {
			//to display the values
			String name1=set.getString(2);
			String pw1=set.getString(3);
		
		if(name1.contentEquals(name)&& pw1.contentEquals(pass)) {
			flag=1;
		}
		if(flag==1) {
			
			System.out.println("Details are correct");
		}
		else {
			System.out.println("Details are incorrect");
		}
		
		Firstapp first=new Firstapp();
		first.choice();
		
	}
	}
}
