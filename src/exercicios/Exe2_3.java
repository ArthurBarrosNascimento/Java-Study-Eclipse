package exercicios;

import java.util.Scanner;

public class Exe2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois números");
		System.out.print("Número um: ");
		a = sc.nextInt();
		System.out.println("Número dois: ");
		b = sc.nextInt();
		
		sc.close();

		if (a > b) {
			if ((a%b) == 0) {
				System.out.print("São Multiplos");
			} else {
				System.out.print("Não são Multiplos");
			}
		} else if (a < b) {
			if ((b%a) == 0) {
				System.out.print("São Multiplos");
			} else {
				System.out.print("Não são Multiplos");
			}
		}
	}

}
