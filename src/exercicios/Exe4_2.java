package exercicios;

import java.util.Scanner;

public class Exe4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int in = 0;
		int out  = 0;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		
		sc.close();
	}

}
