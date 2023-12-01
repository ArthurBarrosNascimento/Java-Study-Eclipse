package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.PeopleExe2_2;

public class Exe2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		PeopleExe2_2[] people = new PeopleExe2_2[n];
		
		for (int i = 0; i < people.length; i++) {
			System.out.println("Dados da "+ (i + 1) +" pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			people[i] = new PeopleExe2_2(name, age, height);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < people.length; i++) {
			sum += people[i].getHeight();
		}
		
		double heightAvarage = sum / people.length;
		System.out.printf("Altura média: %.2f%n", heightAvarage);
		
		int count = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() <= 16) {
				count++;
				int por = (count * 100) / people.length;
				System.out.printf("Pessoas com menos de 16 anos: %.1f%%", por);
				System.out.println(people[i].getName());
			}
		}
				
		sc.close();
	}

}
