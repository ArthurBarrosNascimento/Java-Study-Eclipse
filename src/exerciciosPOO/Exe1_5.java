package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.BanckAccountExe1_5;

public class Exe1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int countNumber;
		String nameOwnerAccount;
		double initialDeposit;
		char choice;
		
		System.out.print("Enter account number: ");
		countNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		nameOwnerAccount = sc.next();
		System.out.print("Is there an initial deposit? (y/n) ");
		choice = sc.next().charAt(0);
		
		BanckAccountExe1_5 account = new BanckAccountExe1_5(countNumber, nameOwnerAccount);
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account.Deposit(initialDeposit);
			
			System.out.println("Account data:");
			System.out.println(account.toString());
		} else if (choice == 'n') {
			System.out.println("Accont data:");
			System.out.println(account.toString());
		} else {
			System.out.println("Comece de novo o cadastro de uma nova conta");
		}
		
		System.out.print("Enter a deposit value: ");
		initialDeposit = sc.nextDouble();
		
		account.Deposit(initialDeposit);
		
		System.out.println("Update account data");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		initialDeposit = sc.nextDouble();
		
		account.Saque(initialDeposit);
		
		System.out.println("Update account data");
		System.out.print(account.toString());
		
		
		sc.close();
	}
	

}
