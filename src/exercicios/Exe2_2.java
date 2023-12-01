package exercicios;

import java.util.Scanner;

public class Exe2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		sc.close();
		
		if ((x%2) == 0) {
			System.out.print("PAR");
		} else {
			System.out.print("IMPAR");
		}

	}

}
