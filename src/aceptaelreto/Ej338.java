package aceptaelreto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ej338 {

	static java.util.Scanner sc;

	public static boolean casoDePrueba() {
		if (!sc.hasNext())
			return false;
		int examenes = sc.nextInt();
		int memoria = sc.nextInt();
		sc.nextLine();
		String lin = sc.nextLine();
		int[] tot = new int[examenes];

		int copia = 0;
		int pilla = 0;

		StringTokenizer st = new StringTokenizer(lin, " ");
		int count = 0;
		while (st.hasMoreTokens()) {
			tot[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		st=null;
		lin=null;
		for (int i = 0; i < tot.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (tot[j] == tot[i]) {
					copia++;
					if (i - j <= memoria) {
						pilla++;
					}
					break;
				}
			}
		}
		System.out.println(copia + " " + pilla);
		return true;
	}

	public static void main(String args[]) {
		sc = new java.util.Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (casoDePrueba())
			;
	}
}
