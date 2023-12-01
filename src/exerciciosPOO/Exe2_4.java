package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.AlunoExe2_4;

public class Exe2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		AlunoExe2_4[] student = new AlunoExe2_4[n];
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do 1o aluno:");
			sc.nextLine();
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			student[i] = new AlunoExe2_4(name, n1, n2);
		}
		
		for (int i = 0; i < student.length; i++) {
			if (student[i].getMedia() >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
		
		sc.close();
	}

}
