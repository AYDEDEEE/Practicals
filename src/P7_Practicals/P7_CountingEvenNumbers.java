package P7_Practicals;

import java.util.Scanner;

public class P7_CountingEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0, count=0;
		boolean exit=false;
				
		
	    
	    do {
	    	System.out.println ("Enter an integer to add or non-integer to exit");
		    if (!sc.hasNextInt()) {
		        System.out.println("You have altered the exit sequence");
		        sc.next(); // this is important!
		        exit=true;
		    }
		    else{	
		    	number = sc.nextInt();
		    	if(number%2==0) {
		    		count++;
		    	}
		    }
		} while (!exit);
		System.out.println("Thank you! The N of even inputs are "+count+".");
		

	}

}
