package P7_Practicals;

import java.util.Scanner;

public class P7_BinaryRepresentation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
		    System.out.println("Please enter a positive number!");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    num = sc.nextInt();
		} while (num <= 0);
		//System.out.println("Thank you! Got " + num);
		
		//logic
		String real="";
		while (num>0) {
			int i=num%2;
			real=Integer.toString(i)+real;
			num=num/2;
		}
		
		System.out.println("The number in binary is "+real);
		

	}

}
