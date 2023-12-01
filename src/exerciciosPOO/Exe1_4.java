package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.CurrencyConverterExe1_4;


public class Exe1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dolarPrice, dolarBuy;
		
		System.out.print("What is the dollar price? ");
		dolarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dolarBuy = sc.nextDouble();
		
		double result = CurrencyConverterExe1_4.dollarToReal(dolarPrice, dolarBuy);
		
		System.out.printf("Amount to be paid in reais = f%.2%n", result);
		sc.close();
		

	}

}
