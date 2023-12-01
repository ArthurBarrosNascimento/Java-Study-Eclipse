package exercicios;

import java.util.Scanner;

public class Exe4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double media;
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
