package P6_Practicals;

import java.util.Scanner;

public class P6_WaterState {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=0,alt;
		
		//Temperature input
		System.out.println("Please input the tempreture");
		while(!scan.hasNextInt()) {
			System.out.println("Please input valid temperature");
			scan.next();
		}
		t=scan.nextInt();


		
		//Altitude input
		
		do {
			System.out.println("Please input the altitude");
			while(!scan.hasNextInt()) {
				System.out.println("Please input valid altitude");
				scan.next();
			}
			alt= scan.nextInt();
		} while (alt<=0);
		
		
		//logic
		if(t>=0)
			t=t+alt/300;
		
		System.out.print("The water is ");
		
		if(t>=100) {
			System.out.print("gaseous at these conditions.");
		}
		else if(t<=0) {
			System.out.print("solid at these conditions.");
		}
		else {
			System.out.print("liqid at these conditions.");
		}
		

		
		
		
		

	}

}
