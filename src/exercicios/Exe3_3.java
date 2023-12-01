package exercicios;

import java.util.Scanner;

public class Exe3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		do {
			System.out.println("Escolha o combustivel de sua preferencia");
			System.out.println("1 - ALCOOL\n2 - GASOLINA\n3 - DIESEL");
			System.out.println("4 - SAIR");
			System.out.print(": ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				break;
			}
			
		} while (choice != 4);
		
		System.out.printf("MUITO OBRIGADO\nALCOOL: %d\nGASOLINA: %d\nDIESEL: %d",
				alcool, gasolina, diesel);
		sc.close();

	}

}
