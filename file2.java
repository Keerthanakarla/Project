package Banking system;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
                System.out.println("Welcome");
		while(true) {
			System.out.println("--------------------Menu------------------");
			System.out.println("Choose what you want to do");
			System.out.println("1. create account");
			System.out.println("2. deposit");
			System.out.println("3. checkBalance");
			System.out.println("4. withdrawal");
			System.out.println("5. Exit");
			System.out.println("Enter your option : ");
			int option=scn.nextInt();
			switch(option) {
				case 1:
					System.out.println("Enter your name :");
					String name=scn.next();
					System.out.println("Enter the initial amount you want to deposit");
					int balance=scn.nextInt();	
					BankManagement.AccountOpen(name,balance);
					break;
				case 2:
					System.out.println("Enter you customer ID");
					int i1=scn.nextInt();
					System.out.println("Enter amount you want to deposit");
					int amt1=scn.nextInt();
					BankManagement.deposit(i1,amt1);
					break;
				case 3:
					System.out.println("Enter you customer ID");
					int i2=scn.nextInt();
					BankManagement.checkBalance(i2);
					break;
				case 4:
					System.out.println("Enter you customer ID");
					int i3=scn.nextInt();
					System.out.println("Enter amount you want to withdrawal");
					int amt2=scn.nextInt();
					BankManagement.withdrawal(i3,amt2);
					break;
				case 5:
					System.out.println("Exit successfully");
					return;
				default:
					System.out.println("Wrong input enter again");
					break;
			}
		}
	}
}