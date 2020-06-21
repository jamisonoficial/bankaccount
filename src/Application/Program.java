package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BankAccount;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data");

			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			BankAccount bankAccount = new BankAccount(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();

			bankAccount.withdraw(amount);
			
			System.out.println("New balance: " + bankAccount.getBalance());
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Deu merda em outra coisa!!!");
		}
		
		

		sc.close();

	}

}
