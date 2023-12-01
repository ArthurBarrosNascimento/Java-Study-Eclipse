package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.StudentExe1_3;

public class Exe1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		double notaTr1, notaTr2, notaTr3;
		
		name = sc.next();
		notaTr1 = sc.nextDouble();
		notaTr2 = sc.nextDouble();
		notaTr3 = sc.nextDouble();
		
		if (notaTr1 > 30) {
			System.out.print("nota incorreta");
		} else if (notaTr2 > 35 || notaTr3 > 35) {
			System.out.print("nota incorreta");
		}
		
		StudentExe1_3 student = new StudentExe1_3();
		
		student.name = name;
		student.notaTr1 = notaTr1;
		student.notaTr2 = notaTr2;
		student.notaTr3 = notaTr3;
		
		System.out.print(student);
		
		sc.close();
	}

}
