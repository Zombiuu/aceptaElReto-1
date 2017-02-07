package aceptaelreto;

import java.util.StringTokenizer;

public class Ej154_2 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		String matricula = in.nextLine();
		if (matricula.equals("9999 ZZZ")) {
			return false;
		}

		StringTokenizer st = new StringTokenizer(matricula, " ");
		int numeros = Integer.parseInt(st.nextToken());
		String letras = st.nextToken();
		if (numeros <= 9999) {
			numeros += 1;

		}

		char[] charLetras = letras.toCharArray();

		if (numeros == 10000) {
			charLetras[2] += 1;
			numeros = 0;

			if (charLetras[2] > 'Z') {
				charLetras[2] = 'B';
				charLetras[1] += 1;
				if (charLetras[1] > 'Z') {
					charLetras[1] = 'B';
					charLetras[0] += 1;
				}

			} 
				
			

		}

		while (charLetras[2] == 'A' || charLetras[2] == 'E' || charLetras[2] == 'I' || charLetras[2] == 'O'
				|| charLetras[2] == 'U') {
			charLetras[2] += 1;
		}
		while (charLetras[1] == 'A' || charLetras[1] == 'E' || charLetras[1] == 'I' || charLetras[1] == 'O'
				|| charLetras[1] == 'U') {
			charLetras[1] += 1;
		}
		while (charLetras[0] == 'A' || charLetras[0] == 'E' || charLetras[0] == 'I' || charLetras[0] == 'O'
				|| charLetras[0] == 'U') {
			charLetras[0] += 1;
		}

		System.out.printf("%04d", numeros);
		System.out.println(" " + charLetras[0] + charLetras[1] + charLetras[2]);

		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}