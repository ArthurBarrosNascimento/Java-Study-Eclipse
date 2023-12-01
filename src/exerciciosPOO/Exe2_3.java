package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.PessoaExe2_3;

public class Exe2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		PessoaExe2_3[] pessoa = new PessoaExe2_3[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + ( i + 1) + " pessoa: ");
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt();
			
			pessoa[i] = new PessoaExe2_3(name, idade);
		}
		
		int idadeVelha = pessoa[0].getIdade();
		String maisVelha = pessoa[0].getName();
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() > idadeVelha) {
				maisVelha = pessoa[i].getName();
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + maisVelha);
		
		sc.close();
	}

}
