package Application;

import java.util.Scanner;

import model.entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		BankAccount bankAccount = new BankAccount(number, holder, balance, withdrawLimit); 
		
		
		sc.close();
		
	}

}
