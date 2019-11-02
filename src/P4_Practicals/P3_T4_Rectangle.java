package P4_Practicals;

public class P3_T4_Rectangle {

	public static void main(String[] args) {
		int l=4;
		int w=3;
		
		System.out.println("Perimeter is --> "+(2*(l+w)));
		System.out.println("\n Area is --->"+l*w);
		System.out.println("Diagonals are "+(Math.sqrt(Math.pow(l,2)+Math.pow(w, 2))));
	}

}
