package exerciciosPOO;

import java.util.Scanner;

import entitiesExercicioPOO.EmployeeExe2_6;

import java.util.ArrayList;
import java.util.List;

public class Exe2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<EmployeeExe2_6> list = new ArrayList<EmployeeExe2_6>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+ (i + 1));
			sc.nextLine();	
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeExe2_6(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		
		EmployeeExe2_6 emp = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double increasePorSalary = sc.nextDouble();
			emp.IncreaseSalary(increasePorSalary);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeExe2_6 obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}

}
