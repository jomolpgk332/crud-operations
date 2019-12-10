package crud;

import java.sql.SQLException;
import java.util.Scanner;

public class Firstapp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Firstapp first=new Firstapp();
		first.choice();
	}

	public void choice() throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("1)Insert\n2)View\n3)Update\n4)Delete\n5)Login\n6)Exit");
		System.out.println("enter the choice");
		int n=s.nextInt();
		switch(n) {
		case 1:
	
		Insert insert=new Insert();
		insert.ins();
		break;
		case 2:
			
		View view =new View();
		view.viw();
		break;
		case 3:
		Update update=new Update();
		update.upd();
		break;
		case 4:
		Delete delete=new Delete();
		delete.del();
		break;
		case 5:
			Login login=new Login();
			login.log();
			break;
		}
	}

}
