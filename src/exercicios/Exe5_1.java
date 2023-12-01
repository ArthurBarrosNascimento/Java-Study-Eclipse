package exercicios;

import java.util.Scanner;

public class Exe5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.print(vect[i]);
			}
		}
		
		sc.close();
	}

}
