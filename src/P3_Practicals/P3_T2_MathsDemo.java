package P3_Practicals;

public class P3_T2_MathsDemo {

	public static void main(String[] args) {
			int a = 3;
			int b = 4;
			int c = 5;
			int d = 17;
			double w = 3;
			double x = 4;
			
			System.out.println("a + b + c  ="+(a + b + c)+"| Expected = 12");
			
			System.out.println("a - b + c"+(a - b + c)+" | Expected = 4");
			
			System.out.println("a – (b + c)"+(-(b + c)+a)+" | Expected = -6");//switch the position of a Due to compiler thinking a is a Function
			
			System.out.println("a * b * c"+(a * b * c)+" | Expected = 60");
			
			System.out.println("-a"+(-a)+" | Expected = -3 ??");//*(-1)
			
			System.out.println("d / c"+(d / c)+" | Expected = 3");
			
			System.out.println("d % c"+(d % c)+" | Expected = 2");
			
			System.out.println("(double) (d / c)"+((double) (d / c))+" | Expected = 3");//its simply int to double
			
			System.out.println("(double) d / c"+((double) d / c)+" | Expected = 3.4");//brackets first
			
			System.out.println("a + b / c"+(a + b / c)+" | Expected = 3");
			
			System.out.println("(a + b) / c"+((a + b) / c)+" | Expected = 1");
			
			System.out.println("d + a / d + b"+(d + a / d + b)+" | Expected = 21");
			
			System.out.println("(d + a) / (d + b)"+((d + a) / (d + b))+" | Expected = 0");
			
			System.out.println("a * b / a"+(a * b / a)+" | Expected = 4");
			
			System.out.println("a * (b / a)"+(a * (b / a))+" | Expected = a=3");
			
			System.out.println("w * x / w"+(w * x / w)+" | Expected = x=4");
			
			System.out.println("w * (x / w)"+(w * (x / w))+" | Expected = 4 ");
			
			System.out.println("x / w"+(x / w)+" | Expected = 1.33");
			
			System.out.println("(int) (x / w)"+((int) (x / w))+" | Expected = 1");
			
			System.out.println("Math.sqrt(b)"+(Math.sqrt(b))+" | Expected = 2");
			
			System.out.println("Math.pow(c, a)"+(Math.pow(c, a))+" | Expected = 125");
			
			System.out.println("Math.abs(-a)"+(Math.abs(-a))+" | Expected = +3");
			
			System.out.println("Math.max(a, b)"+(Math.max(a, b))+" | Expected = 4");
			

	}
}


