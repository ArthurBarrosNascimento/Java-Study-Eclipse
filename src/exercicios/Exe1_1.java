package exercicios;

import java.util.Scanner;

public class Exe1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, area, valor, preco;
		
		System.out.println("Calculando a área de um terreno retangular");
		System.out.print("Digite a largura do terreno: ");
		x = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		y = sc.nextDouble();
		
		area = x * y;
		
		System.out.print("Digite o valor do terreno por m²: ");
		valor = sc.nextDouble();
		
		sc.close();
		
		preco = area * valor;
		
		System.out.printf("O valor do terreno por m² é de: %.2f%n", preco);
	}

}
