package exercicios;

import java.util.Scanner;

public class Exe4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisão impossivel");
			} 
			else {
				result = a / b;
				System.out.println(result);
			}
			
		}
		
		sc.close();
	}

}
