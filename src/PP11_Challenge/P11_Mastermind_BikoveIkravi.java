package PP11_Challenge;

import javax.print.DocFlavor;
import java.util.Random;
import java.util.Scanner;

public class P11_Mastermind_BikoveIkravi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //first message
        System.out.println("Welcome to the game of Mastermind!\n" +
                "I will choose a secret code of four colours.\n" +
                "The colours can be (R)ed, (O)range, (Y)ellow, (G)reen, (B)lue, or (P)urple\n" +
                "You have 12 attempts to try to guess my code.\n" +
                "Enter your guess like this example: BYYG\n" +
                "After each guess, I will tell you how well you have done.\n" +
                "o means that you have guessed a correct colour in the wrong position.\n" +
                "* means that you have guessed a correct colour in the right position.\n" +
                "Would you like to play a game (y/n)?");

        char ans = 'n';
        ans = sc.next().charAt(0);
        if (ans == 'y') {
            game();
        }

        System.out.println("Have a nice day!");
    }

    public static String randomCodeGen() {
        Random r = new Random();
        String code = "";
        char[] allowed = {'O', 'B', 'G', 'R', 'Y', 'P'};
        for (int i = 0; i < 4; i++) {
            code += Character.toString(allowed[r.nextInt(6)]);
        }
        return code;
    }

    public static void game() {
        Scanner s = new Scanner(System.in);
        boolean didHeWon = false;
        int tries = 12;
        String code = randomCodeGen();
        System.out.println(code);
        while (!didHeWon) {
            System.out.println("You have " + tries + " guesses left.\n" +
                    "Please enter your guess. Valid colours are ROYGBP\n\n" + "User:");

            String input = s.nextLine();
            didHeWon = CHECKandMARK(input, code);

            if (didHeWon){
                System.out.println("Congratulations, you won in "+(12-tries)+" guesses!");
            }

            tries--;

            if(tries==0) System.out.println("You lose. SHAME! SHAME! SHAME!");
        }
    }


    public static boolean CHECKandMARK(String input, String code){
        //CHECKING PART
        String colors = "ROYGBP";
        for (int i = 0; i < 4; i++) {
            if (colors.indexOf(input.charAt(i)) == -1) {
                System.err.println("Invalid input");
                return false;
            }
        }
        System.out.print("Your feedback:  ");
       //MARKING PART
        //first we start with the pins *
        boolean[] c={false,false,false,false};
        boolean[] in={false,false,false,false};
        int count=0;
        for(int i=0;i<4;i++){
            if (input.charAt(i)==code.charAt(i)){
                System.out.print("*");
                c[i]=true;
                in[i]=true;//we need that for the o's. Blacks is an array that makes a value unavailable once it was matched weather bull or cow it does not matter
                count++;
                if(count==4)return true;
            }
        }

        //now the o's
        for (int i=0;i<4;i++){
            if(!in[i]){
                for(int j=0;j<4;j++){
                    if(input.charAt(i)==code.charAt(j) && !c[j] ){
                        System.out.print("o");
                        in[i]=true;
                        c[j]=true;
                        
                    }
                }
            }
        }
        System.out.println();
    return false;

    }


}
