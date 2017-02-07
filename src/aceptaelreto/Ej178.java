package aceptaelreto;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int contador = 0;
		for (int q = 0; q < casos; q++) {
			if (contador == 0) {
				sc.nextLine();
				contador++;
			}
			
			//recepcion de datos
			char[] cadena = sc.nextLine().toLowerCase().toCharArray();

			String comp = sc.nextLine().toLowerCase();

			char[] arr = null;
			
			//quitar espacios
			StringTokenizer st = new StringTokenizer(comp, " ");
			String t = st.nextToken();
			while (st.hasMoreTokens()) {
				t += st.nextToken();
			}
			arr = t.toCharArray();

			//comprobacion
			int pos = 0;
			boolean funciona = false;
			for (int i = 0; i < arr.length; i++) {
				funciona = false;
				for (int j = pos; j < cadena.length; j++) {
					if (arr[i] == cadena[j]) {
						pos = j+1;
						funciona = true;
						break;
					}
				}
				if (!funciona)
					break;
			}
			
			//resultado
			if (funciona) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
