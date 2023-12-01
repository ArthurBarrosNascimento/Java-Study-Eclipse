package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.EmployeeExe2_6;

public class Exe2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		EmployeeExe2_6[] vect = new EmployeeExe2_6[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Employee #"+ (i + 1));
			sc.nextLine();
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			vect[i] = new EmployeeExe2_6(id, name, salary);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getId() != idEmployee) {
				System.out.println("This id does not exist");
			} else {
				System.out.print("Enter the percentage: ");
				double increasePorSalary = sc.nextDouble();
				vect[i].IncreaseSalary(increasePorSalary);
			}
		}
		
		System.out.println("List of Employee: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}

}
