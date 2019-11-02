package P3_Practicals;

public class P3_T2_StringDemo {

	public static void main(String[] args) {
		String s = "Stirling Castle";
		 String t = "The Wallace Monument";
		 
		 System.out.println("s + t"+(s + t)+" | Expected -- sticked together ");
		 System.out.println("s + \" \" + t"+(s + " " + t)+" | Expected -- space in between ");
		 System.out.println("s + \"\\n\" + t"+(s + "\n" + t)+" | Expected -- new line in between ");
		 System.out.println("s.length()"+(s.length())+" | Expected -- s.length()=15 ");
		 System.out.println("s.length() + 10"+(s.length() + 10)+" | Expected -- 25 ");
		 System.out.println("s.length() + \"10\""+(s.length() + "10")+" | Expected -- 1510 ");
		 System.out.println("s.substring(0, 4)"+(s.substring(0, 4))+" | Expected --  Stir");
		 System.out.println("s.substring(1, s.length())"+(s.substring(1, s.length()))+" | Expected -- All but first letter ");
	}

}
