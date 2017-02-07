package aceptaelreto;

import java.util.Scanner;

public class Ej224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while (x != 0) {
			x = sc.nextInt();
			if (x != 0) {
				int[] arr = new int[x];
				boolean salir = false;
				for (int i = 0; i < x; i++) {
					arr[i] = sc.nextInt();
				}
				for (int i = 0; i < x-1; i++) {
					int sum = 0;
					for (int j = i + 1; j < x; j++) {
						sum += arr[j];
						if (sum > arr[i]) {
							break;
						}
					}
					if (arr[i] == sum) {
						salir = true;
						int asdf=i+1;
						System.out.println("SI "+ asdf);
						break;
					}
				}
				if (!salir) {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}
}
