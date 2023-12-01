package exercicios;

import java.util.Scanner;

public class Exe2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int codigoCachorroQuente = 1;
		final int codigoXSalada = 2;
		final int codigoXBacon = 3;
		final int codigoTorradaSimples = 4;
		final int codigoRefrigerante = 5;
		
		final double precoCachorroQuente = 4.00; 
		final double precoXSalada = 4.50;
		final double precoXBacon = 5.00;
		final double precoTorradaSimples = 2.00;
		final double precoRefrigerante = 1.50;
		
		double totalAPagar;
		
		int codigoItem, quantidadeItem;
		
		System.out.println("!Digite o código do seu pedido e quantidade abaixo: ");
		System.out.print("CÓDIGO DO ITEM: ");
		codigoItem = sc.nextInt();
		System.out.print("QUANTIDADE: ");
		quantidadeItem = sc.nextInt();
		
		sc.close();
		
		if (codigoItem == codigoCachorroQuente) {
			totalAPagar = precoCachorroQuente * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f%n", totalAPagar);
		} 
		else if (codigoItem == codigoXSalada) {
			totalAPagar = precoXSalada * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f%n", totalAPagar);
		}
		else if (codigoItem == codigoXBacon) {
			totalAPagar = precoXBacon * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f%n", totalAPagar);
		}
		else if (codigoItem == codigoTorradaSimples) {
			totalAPagar = precoTorradaSimples * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f%n", totalAPagar);
		}
		else if (codigoItem == codigoRefrigerante) {
			totalAPagar = precoRefrigerante * quantidadeItem;
			System.out.printf("TOTAL: R$ %.2f%n", totalAPagar);
		}
		else {
			System.out.println("Não há pedidos");
		}
	}

}
