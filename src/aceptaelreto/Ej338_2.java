package aceptaelreto;

import java.util.ArrayList;

public class Ej338_2 {

	static java.util.Scanner sc;

	public static boolean casoDePrueba() {
		if (!sc.hasNext())
			return false;
		int examenes = sc.nextInt();
		int memoria = sc.nextInt();

		sc.nextLine();
		int[] tot = new int[memoria];
		ArrayList<Integer> total=new ArrayList<Integer>();

		int copia = 0;
		int pilla = 0;

		for (int i = 0; i < memoria; i++) {
			total.add(Integer.parseInt(sc.next()));
		}
		

		for (int i = 0; i < total.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (total.get(i) == total.get(j)) {
					copia++;
					if (i - j <= memoria) {
						pilla++;
					}
					break;
				}
			}
		}
		
		while(sc.hasNext()){
			total.remove(0);
			total.add(Integer.parseInt(sc.next()));
			
			for (int j = total.size()-2; j >= 0; j--) {
				if (total.get(total.size()-1) == total.get(j)) {
					copia++;
					
						pilla++;
					
					break;
				}
			}
		}
		
		
		System.out.println(copia + " " + pilla);
		return true;
	}

	public static void main(String args[]) {
		sc = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
