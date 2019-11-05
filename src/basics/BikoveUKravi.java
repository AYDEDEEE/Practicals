package basics;

import java.util.Scanner;

public class BikoveUKravi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String code="OROR";

        boolean ok=true;

       while(ok){
           System.out.println("enter --> ");
           String input=s.nextLine();
           ok=CHECKandMARK(input,code);
           ok=!ok;
       }
    }

    public static void print(boolean a[]) {

        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println();
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
                in[i]=true;
                count++;
                if(count==4)return true;
            }
        }
        /*System.out.println("Code is:");
        print(c);
        System.out.println("Input is:");
        print(in);*/
        //now the o's
        for (int i=0;i<4;i++){
            if(!in[i]){
                for(int j=0;j<4;j++){
                    if(Character.toString(input.charAt(i)).matches(code.substring(j,j+1)) && !c[j] && !in[i]){
                        System.out.print("o");
                        in[i]=true;
                        c[j]=true;

                    }
                }
            }
            /*System.out.println("Code is:");
            print(c);
            System.out.println("Input is:");
            print(in);*/
        }
        System.out.println();
        return false;

    }

}
