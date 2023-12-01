package exercicios;

import java.util.Scanner;

public class Exe5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] numbers = new double[n];
		
		for (int i = 0; i < numbers.length; i++)  {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		double avr = sum/numbers.length;
		
		System.out.print("VALORES = ");
		for (int i=0; i < numbers.length; i++) {
	    	System.out.printf("%.1f  ", numbers[i]);
	    }
		
		System.out.printf("\nSOMA = %.2f\n", sum);
		System.out.printf("MEDIA = %.2f\n", avr);
		sc.close();
	}

}
