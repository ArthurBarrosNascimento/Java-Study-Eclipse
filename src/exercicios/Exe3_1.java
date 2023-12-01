package exercicios;

import java.util.Scanner;

public class Exe3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senhaSecreta = 12345;
		int senhaTentada = 0;
				
		System.out.println("Adivinhe a senha");
		System.out.print("SENHA: ");
		senhaTentada = sc.nextInt();
		
		while (senhaTentada != senhaSecreta) {
			System.out.println("Senha invalida");
			System.out.print("SENHA: ");
			senhaTentada = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Acesso Permitido");
	}

}
