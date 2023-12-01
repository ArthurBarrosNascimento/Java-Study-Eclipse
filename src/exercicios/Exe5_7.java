package exercicios;

import java.util.Scanner;

public class Exe5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int somapares = 0, npares = 0;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somapares += vect[i];
				npares++;
			}
		}
		
		if (npares == 0) {
			System.out.print("NENHUM NUMERO PAR");
		} else {
			media = (double)somapares/npares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}
		
		sc.close();
		
	}

}
