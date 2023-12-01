package exercicios;

import java.util.Scanner;

public class Exe4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		int qua, cubo;
		
		for (int i = 1; i <= n; i++) {
			qua = i * i;
			cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, qua, cubo);
		}
		
		sc.close();
	}

}
