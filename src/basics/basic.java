package basics;

import java.util.Scanner;

public class basic {
	public static void main(String[] args) {

		int[] a = {23, 54, 343, 75, 12};

		Scanner sc =new Scanner(System.in);

		String input = sc.nextLine();
		String[] integerStrings = input.split(" ");
		for (int i=0;i<a.length;i++){
			System.out.print("  " + integerStrings[i]+"   ");
		}
		for(int i=0;i<a.length;i++){
			try {
				if(a[i]!=Integer.parseInt(integerStrings[i])){
					//return 0;
					System.out.println("wrong");
					break;

				}
			} catch (java.lang.NumberFormatException nfe) {
				// Some error handling.
				System.err.println("Invalid input");
				//return 0;
				System.out.println("invalid");

			}

		}
		System.out.println("ok");
		//return 1;

		}



		
	}

