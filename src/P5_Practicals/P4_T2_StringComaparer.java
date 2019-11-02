package P5_Practicals;

import java.util.Scanner;

public class P4_T2_StringComaparer {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter two  words separated by space:\n");
	String data = scan.nextLine().toLowerCase();
	String[] words = data.split("\\s+");
	int input = words[0].compareTo(words[1]);
	if (input!=0) {
		if (input > 0){
			System.out.println (words[1]+"  comes before  "+words[0]);
		}
		else {
			System.out.println (words[0]+"  comes before  "+words[1]);
		}
		}
		else {
		System.out.println (words[0]+" is the same as "+words[1]);
	}
	
	
	
	
	/*for(int i=0;i<pieces.length;i++) {
		System.out.println(pieces[i]);
	}*/
	
	/*System.out.println("Player 1: Choose rock, paper, or scissors:"); 
	String player1 = scan.next().toLowerCase();
	System.out.println(player1);*/
	
	
	
	}
}
	
