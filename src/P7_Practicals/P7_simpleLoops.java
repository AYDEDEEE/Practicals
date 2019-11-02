package P7_Practicals;

public class P7_simpleLoops {

	public static void main(String[] args) {
		int i = 0,d=0;
        int limit = 6;
        while (i < limit)
        {
           System.out.println("i = " + i);
           i++;    // increment the loop index
        }
        do {
        	System.out.println("d= "+d);
        	d=d+2;
        }while(d<10);
        
        for(int f=10;f<=100;f=f+2) {
        	System.out.print("|  f= "+f+"  ");
        }
	
	}
}
