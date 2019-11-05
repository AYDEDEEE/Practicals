package pp10_Practicals;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.pow;
import static java.lang.Math.random;

public class P10_BinaryArray {
	public static void main (String[] args){
	
		 /*final int MIN = 0;
		 final int MAX = (int) (pow(2,30)-1);
		 int[] digits = new int[30]; // array to hold the digits
		 int[] a= {0,2,3,22,33,100};
		*/

		Random rand= new Random();

		int[] a= new int[10];

		for(int i=0;i<10;i++){
			a[i]=rand.nextInt(500000);
		}

		//finding the largest number
		int max=0;
		for(int i=0; i<a.length; i++){
			if(a[i]>max) max=a[i];
		}

		 int[][] bin=binarray(a,max);

		 doublePrint(a,bin);
	}
	
	public static void backPrint(int a[], int bin[]) {
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

	//prints a double array
	public static void doublePrint(int a[],int bin[][]){
		for (int i=0; i<bin.length;i++){

			System.out.print(a[i]+" has a binarry value of ");

			for(int j=0; j<bin[0].length;j++){
				System.out.print(bin[i][j]);

			}

			System.out.println();
		}
	}

	// creatring a 2d array with the binnary
	public static int[][] binarray(int a[],int max) {

		//binary length representation
		int binlength=0;
		for (int i=0;i>-4;i++){//run until otherwise
			if(pow(2,i)>max){
				binlength=i;
				break;
			}
		}

		//getting the 2d array filled
		int[][] bin= new int[a.length][binlength];
		for(int i=0;i<a.length;i++){
			bin[i]=binar(a[i],binlength);
		}
		return bin;
	}

	//converts numbers into binary arrays
	public static int[] binar(int in,int binlength){
		int bin[]=new int[binlength];
		int last = in;
		for (int i=0;i<binlength;i++){
			bin[binlength-i-1]=last%2;
			last=last/2;
		}
		return bin;
	}

	//sums an array
	public static int sum (int[] array){
		int total = 0;
	 	for (int element : array){
	 		total = total + element;
		}
	 	return total;
		}
	}