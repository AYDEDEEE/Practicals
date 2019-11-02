package P3_Practicals;

public class P3_T1_IntegerDemo {

	public static void main(String[] args) {
		
		 int a=10; // declaration of an integer variable
		 int b = 23; // declaration with assignment of initial value
		 int c, d, e; // three integer variables declared together
		 c=65;
		 d=a+b;
		 b = b + 30; // assignment statement
		 
		 System.out.println("a is"+a);
		 System.out.println("b is"+b);
		 System.out.println("c is"+c);
		 System.out.println("d is"+d);
		 //System.out.println("e is"+e); e does not have a value
		 		 
		 a=15;//d wont change
		 
		 final int f = 12;
		 //cannot assign a new value as f is final
		 
		 e=a+f;
		 System.out.println("e is"+e);
		 
		 
		 
		 
		 

	}

}
