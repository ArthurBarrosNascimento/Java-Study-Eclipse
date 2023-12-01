package exercicios;

import java.util.Scanner;

public class Exe1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.print("Digite quatro números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		sc.close();
		dif = (a * b) - (c * d);
		
		System.out.printf("A diferença: %d", dif);
	}

}
