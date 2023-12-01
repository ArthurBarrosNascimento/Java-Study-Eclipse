package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.GenderExe2_5;

public class Exe2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoa você vai digitar? ");
		int n = sc.nextInt();
		
		GenderExe2_5[] vect = new GenderExe2_5[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Genero da " + (i + 1) + " pessoa: ");
			char gender = sc.next().charAt(0);
			System.out.print("Altura da " + (i + 1) + " pessoa: ");
			double altura = sc.nextDouble();
			
			vect[i] = new GenderExe2_5(gender, altura);
		}
		
		double soma = 0.0, mediaM;
		int count = 0, countM = 0;
		
		double menorAltura = vect[0].getAltura();
		double maiorAltura = vect[0].getAltura();
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
			if (vect[i].getGenero() == 'M') {
				count++;
			}
			if (vect[i].getGenero() == 'F') {
				soma += vect[i].getAltura();
				countM++;
			}
		}
		
		mediaM = soma / countM;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaM);
		System.out.printf("Numero de homens: %d", count);
		
		sc.close();
	}

}
