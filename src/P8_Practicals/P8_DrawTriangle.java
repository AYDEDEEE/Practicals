package P8_Practicals;

import java.util.*;

public class P8_DrawTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand= new Random();
		char ans='y';
		boolean check=true;
		
		
		
		while(check) {
			System.out.println("Do you want a triangle");
			
		    ans= sc.next().charAt(0);
		    if(ans=='y') {
				int c=rand.nextInt(10);
				for(int row=0;row<c;row++){
					printSpace(c-row-1);
					printX(2*row+1);
					printSpace(c-row-1);
					System.out.println();
					
					
				}
		    }
		    
		 
		}
		sc.close();
		
	}
	
	public static void printSpace(int times) {
		for(int i=0;i<times;i++) {
			System.out.print(" ");
		}
	}
	
	public static void printX(int times) {
		for(int i=0;i<times;i++) {
			System.out.print("X");
		}
	}

}
