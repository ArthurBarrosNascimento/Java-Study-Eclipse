package exercicios;

import java.util.Scanner;

public class Exe2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.print("Digite um número entre 0 e 100: ");
		n = sc.nextDouble();
		
		sc.close();
		
		if (n > 0 && n < 25) {
			System.out.println("INTERVALO: [0, 25]");
		}
		else if (n > 25 && n < 50) {
			System.out.println("INTERVALO: [25, 50]");
		}
		else if (n > 50 && n < 75) {
			System.out.println("INTERVALO: [50, 75]");
		}
		else if (n > 75 && n < 100) {
			System.out.println("INTERVALO: [75, 100]");
		} 
		else {
			System.out.println("FORA DE INTERVALO");
		}
	}

}
