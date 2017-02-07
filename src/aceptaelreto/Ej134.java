package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class Ej134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "hola";
		int caso = 1;
		while (caso != 0) {
			a = sc.next();
			if (a.equals("J")) {
				caso = 11;
			} else if (a.equals("Q")) {
				caso = 12;
			} else if (a.equals("K")) {
				caso = 13;
			} else if (a.equals("A")) {
				caso = 14;
			} else {
				caso = Integer.parseInt(a);
			}
			if (caso != 0) {
				int[] numeros = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
				int[] mano = new int[4];
				String asdf = "";
				char palo[] = new char[4];
				for (int i = 0; i < mano.length; i++) {
					if (i != 0) {
						a = sc.next();
						if (a.equals("J")) {
							mano[i] = 11;
						} else if (a.equals("Q")) {
							mano[i] = 12;
						} else if (a.equals("K")) {
							mano[i] = 13;
						} else if (a.equals("A")) {
							mano[i] = 14;
						} else {
							mano[i] = Integer.parseInt(a);
						}
					} else {
						mano[i] = caso;
					}
					asdf += sc.next();
				} // fin for de relleno
				palo = asdf.toCharArray();
				boolean isPalo = true;
				for (int i = 0; i < palo.length - 1; i++) {
					if (palo[i] != palo[i + 1]) {
						isPalo = false;
						break;
					}
				}
				if (isPalo) {
					int res = 0;
					Arrays.sort(mano);
					int count = 0;
					int x = 0;
					boolean isFunciona = false;
					int josele = mano[0] + 2;
					for (int i = mano[0] - 2; i < josele; i++) {
						if (mano[x] == numeros[i]) {
						} else {
							count++;
							x--;
							isFunciona = true;
							res = numeros[i];
							josele++;
						}
						if (count > 1)
							break;
						x++;
					}
					if (count > 1) {
						System.out.println("NADA");
					} else {
						if (isFunciona) {
							if (res == 11) {
								System.out.println("J " + palo[0]);
							} else if (res == 12) {
								System.out.println("Q " + palo[0]);
							} else if (res == 13) {
								System.out.println("K " + palo[0]);
							} else if (res == 14) {
								System.out.println("A " + palo[0]);
							} else
								System.out.println(res + " " + palo[0]);
						} else {
							if (mano[0] == 11) {
								System.out.println((mano[0] - 1) + " " + palo[0]);
							} else {
								if (mano[3] + 1 == 11) {
									System.out.println("J " + palo[0]);
								} else if (mano[3] + 1 == 12) {
									System.out.println("Q " + palo[0]);
								} else if (mano[3] + 1 == 13) {
									System.out.println("K " + palo[0]);
								} else if (mano[3] + 1 == 14) {
									System.out.println("A " + palo[0]);
								} else {
									System.out.println((mano[3] + 1) + " " + palo[0]);
								}
							}
						}
					}
				} else {
					System.out.println("NADA");
				}
			}
		}
		sc.close();
	}
}
