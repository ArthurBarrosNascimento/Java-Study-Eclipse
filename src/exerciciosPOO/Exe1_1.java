package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.RetanguloExe_1_1;

public class Exe1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double w, h;
		
		System.out.println("Digite dois números abaixo: ");
		w = sc.nextDouble();
		h = sc.nextDouble();
		
		RetanguloExe_1_1 ret = new RetanguloExe_1_1();
		
		ret.width = w;
		ret.heigth = h;
		
		System.out.println(ret);
		
		sc.close();

	}

}
