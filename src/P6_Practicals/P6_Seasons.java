package P6_Practicals;

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
		
		

		
		//day input
		if(m==2) {
			do {
			    System.out.println("Please input the day");
			    while (!sc.hasNextInt()) {
			        System.out.println("That's not a number!");
			        sc.next(); // this is important!
			    }
			    d = sc.nextInt();
			} while (d<1 || d>29);
		}
		boolean nm=false;
		if(m>=8) {
			nm=true;
		}
		if(m%2==1 && !nm || m%2==0 && nm) {
			do {
			    System.out.println("Please input the day");
			    while (!sc.hasNextInt()) {
			        System.out.println("That's not a number!");
			        sc.next(); // this is important!
			    }
			    d = sc.nextInt();
			} while (d<1 || d>31);
		}else {
			do {
			    System.out.println("Please input the day");
			    while (!sc.hasNextInt()) {
			        System.out.println("That's not a number!");
			        sc.next(); // this is important!
			    }
			    d = sc.nextInt();
			} while (d<1 || d>30);
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
