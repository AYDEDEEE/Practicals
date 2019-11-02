package basics;

import java.util.Scanner;

public class P6_Seasons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d=0,m = 0;
		
		//month input
		do {
		    System.out.println("Please input the month");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    m = sc.nextInt();
		} while (m<1 || m>12);
		
		
		int dMax = 0;
		boolean nm = false;
		
		//day input
		if(m==2) {
			dMax = 29;
		} else if(m>=8) {
			nm=true;
		}
		else if(m%2==1 && !nm || m%2==0 && nm) {
			dMax = 31;
		}else {
			dMax = 30;
		}
		
		
		if(m%3==0 && d>21) {
			m++;
		}
		
		String season="Autumn";
		if(m<3 || m==12) season="Winter";
		if(m>2 && m<6) season="Spring";
		if(m>5 && m<9) season="Summer";
		
		System.out.println("the season is "+season);
		
		
		


	}

}
