package exercicios;

import java.util.Scanner;

public class Exe5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
			
	}

}
