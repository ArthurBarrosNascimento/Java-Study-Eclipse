package exercicios;

import java.util.Scanner;

public class Exe2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite X e Y para ver em qual quadrante se encontra");
		System.out.print("X");
		x = sc.nextDouble();
		System.out.print("Y");
		y = sc.nextDouble();
		
		sc.close();
		
		if ( x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("ORIGEM");
		}
	}

}
