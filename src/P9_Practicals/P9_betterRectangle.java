package P9_Practicals;

import java.util.Random;
import java.util.Scanner;

public class P9_betterRectangle {
	

	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Please enter the width");
			int width=input(sc);
			System.out.println("Please enter the length");
			int length=input(sc);
			
			print(length,width);
			
		}while (again(sc));
		
		sc.close();
		
	 
	 
	 }
	
	 public static boolean again(Scanner sc)
	 {
		 System.out.println("Do you want another rectangle");

		 
		 
		 char ans='y';
		 
		 ans= sc.next().charAt(0);
		 
		 
	     if(ans=='n') {
		 	return false;
	     }
	     else return true;
	 }
	
	 public static int input(Scanner sc)
	 {
	 	
		int number;
		do {
		    System.out.println("Please enter a positive number!");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		} while (number <= 0);
		
		return number;
	 }

	 public static int area (int length, int width)
	 {
	 return length * width;
	 }
	 
	 public static int perimeter (int length, int width)
	 {
	 return (length + width)*2;
	 }
	 
	 public static void print(int length, int width)
	 {
		 System.out.println("The width is : "+ width);
		 System.out.println("The length is :"+ length);
		 System.out.println("The area is : "+area(width,length));
		 System.out.println("The perimeter is : "+perimeter(width, length));// i know, but is the same result. im lasy
		 
	 }
	
}
