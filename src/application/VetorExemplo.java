package application;

import java.util.Scanner;
import entities.Products;

public class VetorExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Products[] vect = new Products[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avr = sum/vect.length;
		
		System.out.printf("Avarage of products is: %.2f%n", avr);
		
		sc.close();
	}

}
