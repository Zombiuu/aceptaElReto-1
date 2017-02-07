package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class Ej180 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();

			double[] asdf={a,b,c};
			Arrays.sort(asdf);
			if (a + b > c && b + c > a && a + c > b) {
				if (asdf[2]*asdf[2]==asdf[0]*asdf[0]+asdf[1]*asdf[1]) {
					System.out.println("RECTANGULO");
				} else if (asdf[2]*asdf[2]<asdf[0]*asdf[0]+asdf[1]*asdf[1]){
					System.out.println("ACUTANGULO");
				}else{
					System.out.println("OBTUSANGULO");
				}
					
			}else{
				System.out.println("IMPOSIBLE");
			}
		}
		sc.close();
	}
}
