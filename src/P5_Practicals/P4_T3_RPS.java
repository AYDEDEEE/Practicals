package P5_Practicals;

import java.util.Scanner;

public class P4_T3_RPS {
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1: Choose rock, paper, or scissors:"); 
		String player1 = scan.next().toLowerCase(); 
		System.out.println("Player 2: Choose rock, paper, or scissors:"); 
		String player2 = scan.next().toLowerCase(); 
		System.out.println("Player 1 chose " + player1); 
		System.out.println("Player 2 chose " + player2);
		
		if (player1.equals("rock")) {
			if (player2.equals("rock")) {
				System.out.println("Ïs the same.Equals!");
			}
			if (player2.equals("paper")) {
				System.out.println("Paper wraps Rock. Player 2 Wins!");
			}
			if (player2.equals("scissors")) {
				System.out.println("Rock smashes Scissors. Player 1 Wins!");
			}
		}
		if (player1.equals("paper")) {
			if (player2.equals("paper")) {
				System.out.println("Ïs the same.Equals!");
			}
			if (player2.equals("rock")) {
				System.out.println("Paper wraps Rock. Player 1 Wins!");
			}
			if (player2.equals("scissors")) {
				System.out.println("Scissors cut paper. Player 1 Wins!");
			}
		}
		if (player1.equals("scissors")) {
			if (player2.equals("scissors")) {
				System.out.println("Ïs the same.Equals!");
			}
			if (player2.equals("rock")) {
				System.out.println("Rock smashes scissors. Player 2 Wins!");
			}
			if (player2.equals("paper")) {
				System.out.println("Scissors cut paper. Player 1 Wins!");
			}
		}
		
		
}

}
