package aceptaelreto;

public class Ej149 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n;
		try{
		n = in.nextInt();
		
		}catch(Exception e){
			return false;
		}

		long y, z = 0;
		for (int j = 0; j < n; j++) {
			y = in.nextLong();
			if (y > z)
				z = y;
		}
		System.out.printf("%d\n", z);
		return true;
	
	}
	

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
