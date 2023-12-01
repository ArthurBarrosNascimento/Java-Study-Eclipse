package exercicios;

import java.util.Scanner;

public class Exe4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		int fat = 1;
		
		for (int i = 1; i <=n; i++) {
			fat *= i;
			
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
