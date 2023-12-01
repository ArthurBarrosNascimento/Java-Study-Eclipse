package exercicios;

import java.util.Scanner;

public class Exe1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14159;
		double raio, area;
		
		System.out.print("Vamos calcular a área de um circulo");
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("O valor da área do circulo é: %.4f%n", area);
	}

}
