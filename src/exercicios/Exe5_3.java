package exercicios;

import java.util.Scanner;

public class Exe5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] arrayInteiro = new int[n];
		
		for (int i = 0; i < arrayInteiro.length; i++) {
			arrayInteiro[i] = sc.nextInt();
		}
		
		int count = 0;
		
		System.out.println("Números Pares:");
		for (int i = 0; i < arrayInteiro.length; i++) {
			if ((arrayInteiro[i] % 2) == 0) {
				System.out.print(arrayInteiro[i] + "\n");
				count++;
			}
		}
		
		System.out.printf("Quantidade de números pares: %d ", count);
		
		sc.close();
	}

}
