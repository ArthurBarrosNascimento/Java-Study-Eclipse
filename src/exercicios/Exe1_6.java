package exercicios;

import java.util.Scanner;

public class Exe1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p1, p2, q1, q2;
		
		double preco1, preco2, total;
		
		System.out.print("Digite o código da peça um: ");
		p1 = sc.nextInt();
		
		System.out.print("Digite o código da peça dois: ");
		p2 = sc.nextInt();
		
		System.out.print("Digite a quantidade de peças número um: ");
		q1 = sc.nextInt();
		
		System.out.print("Digite a quantidade de peças número dois: ");
		q2 = sc.nextInt();
		
		System.out.print("Digite o preço por peça, da peça número um: ");
		preco1 = sc.nextDouble();
		
		System.out.print("Digite o preço por peça, da peça número dois: ");
		preco2 = sc.nextDouble();
		
		sc.close();
		
		total = (preco1 * q1) + (preco2 * q2);
		
		System.out.printf("O valor total a pagar pelas peças de código %s e %d é: R$ %.2f reais%n", p1, p2, total);
		
	}

}
