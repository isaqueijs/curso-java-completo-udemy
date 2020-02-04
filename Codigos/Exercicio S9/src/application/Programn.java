package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Programn {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		char choice;
		System.out.print("Is there na initial deposit (y/n)?");
		choice = sc.next().charAt(0);
		System.out.println();
		while ((choice != 'y') && (choice != 'n')) {
			System.out.print("Is there na initial deposit (y/n)?");
			choice = sc.next().charAt(0);
		}

		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			Account ac = new Account(number, holder, initialDeposit);
			System.out.println(ac.toString());
		} else if (choice == 'n') {
			Account ac = new Account(number, holder);
			System.out.println(ac.toString());
		}
	}

}
