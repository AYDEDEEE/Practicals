package P8_Practicals;

import java.util.Random;
import java.util.Scanner;

public class P8_Nim {

	public static void main(String[] args) {
		Random rand=new Random();
		int stones=rand.nextInt(11)+10;
		boolean player=false;
		
		//intro + present how many stones are there
		System.out.println("Welcome to the game of Nim. This game is setfor two players. The game will begin very shortly. Enjoy! \n \n---------------------------------------------------------- \n \n \n ");
		//user inputva v edin golqm while loop
		
		while(stones>0) {
			System.out.println("-------------- \nThere are "+stones+"stones \n");
			
			int i=outt(player,stones);
			stones=i;
			player=!player;			
		}
		
		
		stones=player? 1:0;
		System.out.println("Congratulations!!!Player "+(stones+1)+" is the winner");
		
		
	}
	
	public static int input(int a,int b) {
		Scanner sc = new Scanner(System.in);
		int number;
		if (b>4)b=4;
		do {
		    System.out.println("Please enter a nuber between "+a+" and "+b);
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		} while (number <a || number>b);
		return number;
	}
	
	public static int outt(boolean p,int total) {
		int player=p? 1:0;
		System.out.println("Its Player "+(player+1)+"'s turn");
		int out = input(1,total);
		return total-out;
	}
	
}
