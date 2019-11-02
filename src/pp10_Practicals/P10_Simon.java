package pp10_Practicals;

import java.util.Random;
import java.util.Scanner;

public class P10_Simon {


    //delay function
    public void delay(int length){
        try{
            Thread.sleep( length );
        }catch ( InterruptedException e ){
            System.out.println ( "sleep interrupted!" );
        }
    }

    public static void main(String[] args) {
        System.out.printf("Welcome to the Simon game");
        int point;
        boolean pass=true;
        for (point=0; pass ;point++){
            pass=action(point+1);
        }
        System.out.println("Wrong.");
        System.out.println("Congrats your score is : "+(point-1));
    }

    //creates a random 1d array
    public static int[] arr(int length) {
        Random rand = new Random();
        int[] arr=new int[length];
        for (int i=0;i<length;i++){
            arr[i]=rand.nextInt((length+10)*3);
        }
        return arr;
    }

    public static void print(int[] a) {
        System.out.println();
        for (int i=0;i<a.length;i++){
            System.out.print("  " + a[i]+"   ");
            new P10_Simon().delay(500);
        }
        System.out.println();
    }

    public static boolean check(int[] a){
        Scanner sc =new Scanner(System.in);

        String input = sc.nextLine();
        String[] integerStrings = input.split(" ");

        for(int i=0;i<a.length;i++){
            try {
                if(a[i]!=Integer.parseInt(integerStrings[i])){
                    return false;
                }
            } catch (java.lang.NumberFormatException nfe) {
                // Some error handling.
                System.err.println("Invalid input");
                return false;

            }

        }
        return true;
    }
    public static boolean action(int lv){
        System.out.println("A list of "+lv+" numbers will be presented.Memorise it : ");
        int[] a = new int[lv];
        a=arr(lv);
        print(a);
        new P10_Simon().delay(100);
        clearScreen();
        System.out.println("Now enter the numbers and separate them by space");
        boolean check = check(a);
        return check;
    }


    //clears the screen
    public final static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
