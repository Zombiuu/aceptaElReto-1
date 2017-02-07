package aceptaelreto;

import java.util.Scanner;

public class Ej304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();

		for (int q = 0; q < casos; q++) {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();

			if (divisor == 0) {
				System.out.println("DIV0");
			} else if (dividendo == 0) {
				for(int asdf=0;asdf<1000000000;asdf++);
				if (divisor > 0) {
					System.out.println("0 0");
				} else if (divisor < 0) {
					System.out.println("-1 " + (divisor - 1));
				}

			} else if (dividendo > 0 && divisor > 0) {
				System.out.println(dividendo / divisor + " " + dividendo % divisor);
			} else if (dividendo > 0 && divisor < 0) {
				System.out.println(dividendo / divisor + " " + dividendo % divisor);
			} else if (dividendo < 0 && divisor > 0) {
				System.out.println((dividendo / divisor - 1) + " " + (dividendo - (dividendo / divisor - 1) * divisor));
			} else {
				System.out.println((dividendo / divisor + 1) + " " + (dividendo - (dividendo / divisor + 1) * divisor));

			}
		}
	}
}
