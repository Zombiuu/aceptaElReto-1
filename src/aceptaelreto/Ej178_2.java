package aceptaelreto;

import java.util.StringTokenizer;

public class Ej178_2 {
	static java.util.Scanner in;

	public static void casoDePrueba() {
		String frase, busqueda;
		frase = in.nextLine().toLowerCase();
		busqueda = in.nextLine().toLowerCase();
		StringTokenizer st = new StringTokenizer(busqueda, " ");
		String asdf = "";
		boolean funciona = true;
		while (st.hasMoreElements()) {
			asdf += st.nextToken();
		}
		int pos = 0;
		for (int j = 0; j < asdf.length(); j++) {
			if (frase.indexOf(asdf.charAt(j), pos) != -1) {
				pos = frase.indexOf(asdf.charAt(j), pos);
				pos++;
			} else {
				funciona = false;
				break;
			}
		}
		if (funciona) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		int numCasos;
		numCasos = in.nextInt();
		in.nextLine();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}
}