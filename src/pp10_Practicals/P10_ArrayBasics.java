package pp10_Practicals;

import java.util.Scanner;

/*
  The loop variable i is initialised as 1 instead of 0;
 it will skip the 8 as its position 0
 The < in the loop condition is changed to <= ;
error out of bounds or etc.
 The update statement is changed to i += 2?
it will print every second

*/


public class P10_ArrayBasics {
	
	public static void main(String[] args)
	 {
	 int [] myArray = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
	 System.out.println ("Length of myArray: " + myArray.length);
	 System.out.println ("Value at index 3: " + myArray[3]);
	 System.out.println ("Value at index 4: " + myArray[4]);
	 myArray[3] = myArray[4];
	 System.out.println ("Value at index 3: " + myArray[3]);
	 System.out.println ("Value at index 4: " + myArray[4]);
	 // <<9;<<21; <<7;<<7;<<7
	 
	 System.out.println ("product is : " + product(myArray));
	 System.out.println ("minimum is : " + minimum(myArray));
	 
	 //-------
	 
	 
	 System.out.println ("Whats the target");
	 Scanner sc = new Scanner(System.in);
	 int target=sc.nextInt();
	 sc.close();
	 System.out.println("the requested value is at the "+find(myArray,target)+" position");
	 
	 }
	
	public static int product (int[] array) {
		 int sum=1;
		
		 for(int i=0;i<array.length;i++) {
			 sum=sum*array[i];
		 }
		 return sum;
			 
	}
	
	public static int minimum(int[] array) {
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		return min;
	 
	}

	
	public static int find (int[] array, int target){
		int i=0;
		while(i<array.length) {
			if(target==array[i]) {
				return ++i;
				
			}
			i++;
		}
		return -1;
		
	}

}
