package exercicios;

import java.util.Scanner;

public class Exe2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, f, duracao;
		
		System.out.println("Digite os horarios do jogo");
		System.out.print("Hora de inicio: ");
		i = sc.nextInt();
		System.out.print("Hora de termino: ");
		f = sc.nextInt();
		
		sc.close();
		
		if (i < f) {
			duracao = f - i;
		} else {
			duracao = 24 - i + f;
		}
		
		System.out.printf("O jogo durou %d", duracao);
	}

}
