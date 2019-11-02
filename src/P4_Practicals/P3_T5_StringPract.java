package P4_Practicals;

public class P3_T5_StringPract {
	public static void main(String[] args) {
			String s= "Humpty Dumpty sat on a wall.";
			String news='\u0022' +s+"."+'\u0022' ;
			System.out.println("The String s is "+news);
			System.out.println("The length"+s.length());
			System.out.println(s.substring(13,s.length())+s.substring(0,13));
			
		 
		
		
		
	}
}
