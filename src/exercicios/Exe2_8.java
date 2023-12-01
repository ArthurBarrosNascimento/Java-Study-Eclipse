package exercicios;

import java.util.Scanner;

public class Exe2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.print("Digite seu Salario para sabe rqunato de imposto deve pagar: ");
		salario = sc.nextDouble();
		
		sc.close();
		
		if (salario > 2000.01 && salario <= 3000.00) {
			salario = (salario - 2000.0) * 0.08;
			System.out.printf("imposto a pagar R$ %.2f%n", salario);
		}
		else if (salario > 3000.01 && salario <= 4500.00) {
			salario = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("imposto a pagar R$ %.2f%n", salario);
		}
		else if (salario > 4500.00) {
			salario = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("imposto a pagar R$ %.2f%n", salario);
		}
		else {
			System.out.println("insento");
		}
	}

}
