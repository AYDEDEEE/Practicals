package P9_Practicals;

/*
What is the result of running this program?
 What is the return type of the area method?
	int
 What are the names and types of the parameter variables of the area method?
	length & width, both int
 What are the values of the arguments provided when the area method is called?
	length,width
		5,3
		6,2
		8,3
 */




public class P9_Rectangle_M1 {


		public static void main(String[] args)
		 {
		 System.out.println (area(5,3));
		 System.out.println (area(6,2));
		 System.out.println (area(8,3));
		 
		 System.out.println ("/n --- /n");
		 
		 System.out.println (perimeter(5,3));
		 System.out.println (perimeter(6,2));
		 System.out.println (perimeter(8,3));
		 
		 System.out.println ("/n --- /n");
		 print(5,3);
		 
		 
		 }

		 public static int area (int length, int width)
		 {
		 return length * width;
		 }
		 
		 public static int perimeter (int length, int width)
		 {
		 return (length + width)*2;
		 }
		 
		 public static void print(int length, int width)
		 {
			 System.out.println("The width is : "+ width);
			 System.out.println("The length is :"+ length);
			 System.out.println("The area is : "+area(width,length));
			 System.out.println("The perimeter is : "+perimeter(width, length));// i know, but is the same result. im lasy
			 
		 }
	

}
