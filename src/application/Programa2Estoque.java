package application;

import java.util.Scanner;
import entities.Estoque;

public class Programa2Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Estoque n =new Estoque(name, price, quantity);

		System.out.printf("Product data: %s, $ %.2f$n, %d units, Total: $ %.2f%n"
				, n.name, n.price, n.quantity, n.TotalValueInStock());
		System.out.print("Enter the number of products to be added in stock: ");
		int in = sc.nextInt();

		n.AddProducts(in);

		System.out.printf("Product data: %s, $ %.2f$n, %d units, Total: $ %.2f%n"
				, n.name, n.price, n.quantity, n.TotalValueInStock());
		System.out.print("Enter the number of products to be removed from stock: ");
		int out = sc.nextInt();

		n.RemoveProducts(out);

		System.out.printf("Product data: %s, $ %.2f$n, %d units, Total: $ %.2f%n"
				, n.name, n.price, n.quantity, n.TotalValueInStock());

		sc.close();

	}

}
