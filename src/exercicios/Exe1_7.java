package exercicios;

import java.util.Scanner;

public class Exe1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, cir, tra, qua, ret;
		
		final double pi = 3.14159;
		
		System.out.println("Vamos calcular algumas áreas");
		System.out.println("Digite três valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		sc.close();
		
		tri = (a * c) / 2;
		cir = pi * Math.pow(c, 2);
		tra = ((a + b) * c) / 2;
		qua = Math.pow(b, 2);
		ret = a* b;
		
		System.out.printf("Devidas ÁREAS CALCULADAS:\nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
				tri, cir, tra, qua, ret);
	}

}
