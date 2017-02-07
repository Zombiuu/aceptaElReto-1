//package aceptaelreto;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Ej224_3 {
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	public static boolean casoDePrueba() {
//		int numCortezas = in.nextInt();
//		int[] cortezas = new int[numCortezas];
//		int suma = 0;
//		String respuesta = "";
//		int n = 0;
//		int count = 0;
//		if (numCortezas == 0) {
//			return false;
//		}
//		for (int i = 0; i < cortezas.length; i++) {
//			cortezas[i] = in.nextInt();
//		}
//
//		suma = cortezas[cortezas.length - 1];
//		for (int r = cortezas.length - 2; r >= 0; r--) {
//			if (suma == cortezas[r]) {
//
//				respuesta = "SI ";
//				count++;
//				n = r;
//			}
//			suma += cortezas[r];
//		}
//		if (count == 0) {
//			System.out.println("NO");
//		} else
//			System.out.println(respuesta + (n + 1));
//
//		return true;
//	}
//
//	public static void main(String args[]) {
//		in = new java.util.Scanner(System.in);
//		while (casoDePrueba())
//			;
//	}
//}
