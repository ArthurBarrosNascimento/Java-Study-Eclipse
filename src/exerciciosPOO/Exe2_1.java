package exerciciosPOO;

import java.util.Scanner;
import entitiesExercicioPOO.RentRoom;


public class Exe2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		RentRoom[] bedrooms = new RentRoom[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			bedrooms[room] = new RentRoom(name, email, room);
		}
		
		for (int i = 0; i < bedrooms.length; i++) {
			if (bedrooms[i] != null) {
				System.out.println(i + ": " + bedrooms[i]);
			}
		}
		
		sc.close();
	}

}
