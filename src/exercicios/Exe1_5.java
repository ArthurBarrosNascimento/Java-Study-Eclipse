package exercicios;

import java.util.Scanner;

public class Exe1_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nf, ht;
		
		double hs, salario;
		
		System.out.print("Vamos calcular seu salario, digite o seu número de empregado: ");
		nf = sc.nextInt();
		
		System.out.print("Agora digite o número de horas trabalhadas: ");
		ht = sc.nextInt();
		
		System.out.print("E por último, o valor de hora trabalhada: ");
		hs = sc.nextDouble();
		
		salario = ht * hs;
		
		System.out.printf("Funcionario do número %s recebeu por suas horas trabalhadas %.2f%n", nf, salario);
		
		sc.close();
	}

}
