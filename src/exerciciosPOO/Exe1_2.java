package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.FuncionarioExe1_2;

public class Exe1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		double grossSalary;
		double tax;
		
		System.out.print("NAME: ");
		name = sc.nextLine();
		System.out.print("GROSS SALARY: ");
		grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		tax = sc.nextDouble();
		
		FuncionarioExe1_2 fun = new FuncionarioExe1_2();
		
		fun.name = name;
		fun.grossSalary = grossSalary;
		fun.tax = tax;
		
		fun.NetSalary();
		
		System.out.printf("Employee: %s, %.2f%n", fun.name, fun.grossSalary);
		
		System.out.print("Which percentage to increase salary? ");
		double por = sc.nextDouble();
		
		fun.IncreaseSalary(por);
		
		System.out.println(fun);
		sc.close();
		
		
	}

}
