package exercicios;

import java.util.Scanner;

public class Exe5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) { // linha
			for (int y = 0; y < mat[i].length; y++) { // coluna
				mat[i][y] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			} 
		}
		
		System.out.println("Negative Numbers" + count);
		
		sc.close();
	}
}
