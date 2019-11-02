package P7_Practicals;

import java.util.Scanner;

public class P7_inputLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0,sum=0,count=0;
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
		    	sum=sum+number;
		    	count++;
		    }
		} while (!exit);
		System.out.println("Thank you! Sum is " + sum+" and the N of inputs are "+count+".");
		
	}

}
