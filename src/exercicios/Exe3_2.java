package exercicios;

import java.util.Scanner;

public class Exe3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os valores de X e Y: ");
		System.out.print("X: ");
		x = sc.nextInt();
		System.out.print("Y: ");
		y = sc.nextInt();
		
		if (x > 0 && y > 0 ) {
			System.out.println("primeiro");
		} else if ( x < 0 && y > 0) {
			System.out.println("segundo");
		} else if (x < 0 && y < 0) {
			System.out.println("terceiro");
		} else if (x < 0 && y > 0 ) {
			System.out.println("quarto");
		} else {
			System.out.println("");
		}
		
		while (x != 0 & y != 0) {
			System.out.println("Digite os valores de X e Y: ");
			System.out.print("X: ");
			x = sc.nextInt();
			System.out.print("Y: ");
			y = sc.nextInt();
			
			if (x > 0 && y > 0 ) {
				System.out.println("primeiro");
			} else if ( x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0 ) {
				System.out.println("quarto");
			} else {
				System.out.println("");
			}
			
		}
		sc.close();
	}

}
