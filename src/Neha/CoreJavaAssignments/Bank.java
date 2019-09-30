/* Create Bank class with fields account_no, name and amount .Create the following methods: Make it menu Driven Program using switch.
Use Scanner class for taking inputs from User
a) insertData()... [To save account_no, name and amount given by user].
b) deposit()
c) withdraw()
d) checkBalance()
e) displayDetails()
Create BankClient class to test functionalities of Bank class.
*/
package Neha;

import java.util.Scanner;

public class Bank {

	private double balance;
	private int accountnumber;
	private String name = "";
	private double amount;

	void bankoperations() {
		System.out.println("Enter bank operation (1-Check balance,2-Withdraw,3-Deposit,4-Display details,5-Exit)");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		switch (op) {
		case 1:
			checkbalance();
			break;
		case 2:
			withdraw();
			break;
		case 3:
			deposit();
			break;
		case 4:
			displaydetails();
			break;
		case 5:
			System.out.println("You have logged out successfully!");
			break;
		default:
			System.out.println("Please enter valid operation!");
			break;
		}
	}

	void insertdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number");
		this.accountnumber = sc.nextInt();
		System.out.println("Enter amount");
		this.amount = sc.nextInt();
		System.out.println("Enter account holder's name");
		this.name = sc.next();
		bankoperations();

	}

	void deposit() {

		balance = balance + amount;
		System.out.println("Balance after deposit is " + balance);
	}

	void withdraw() {
		if (amount < balance)
			balance = balance - amount;
		else
			System.out.println("Please enter valid amount!");
		System.out.println("Balance after withdrawl is " + balance);
	}

	void checkbalance() {
		// balance = amount;
		System.out.println("Balance in account is" + balance);

	}

	void displaydetails() {
		System.out.println("Hi " + name);
		System.out.println("Your Account " + accountnumber + " has total balance " + balance);
		System.out.println("Thank you for banking us!");
	}

}
