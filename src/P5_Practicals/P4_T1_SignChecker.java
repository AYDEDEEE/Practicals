package P5_Practicals;

import java.util.Scanner;

public class P4_T1_SignChecker {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println ("Enter an integer");
			
			if (scan.hasNextInt()){
					int input = scan.nextInt();
					if (input!=0) {
							if (input > 0){
								System.out.println ("This number is positive.");
							}
							else {
								System.out.println ("This number is negative.");
							}
					}
					else {
							System.out.println ("This number is 0.");
					}
			  }
			else {
			      	System.out.println("Not an integer.");
			  }
			
	}

}
