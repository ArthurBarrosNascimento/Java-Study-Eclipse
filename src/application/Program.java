package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do Triângulo X: %.4f%n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.print("Área maior: X");
		} else {
			System.out.print("Área maior: Y");
		}

		sc.close();
	}

}
