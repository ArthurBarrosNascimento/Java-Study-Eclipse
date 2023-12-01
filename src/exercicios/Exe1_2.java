package exercicios;

import java.util.Scanner;

public class Exe1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y, soma;
		
		System.out.print("Digite um número inteiro: ");
		x = sc.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		y = sc.nextInt();
		
		sc.close();
		
		soma = x + y;
		
		System.out.printf("A soma dos dois números inteiros é: %s", soma);
	
	}

}
