package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej332 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();

		for (int q = 0; q < casos; q++) {
			int[] carros = new int[10];
			for (int i = 0; i < carros.length; i++) {
				carros[i] = sc.nextInt();
			}
			int[] res=new int [5];

			int i, j, s, k, h, n;
			double d;
			double m[][];
			double r[] = { carros[0], carros[1], carros[2] };
			double x[] = new double[3];
			n = 3;
			m = new double[n][n];

			m[0][0] = 1;
			m[0][1] = 1;
			m[0][2] = 0;

			m[1][0] = 1;
			m[1][1] = 0;
			m[1][2] = 1;

			m[2][0] = 0;
			m[2][1] = 1;
			m[2][2] = 1;

			for (i = 0; i <= n - 1; i++) {
				k = i + 1;
				x[i] = 0;
				for (j = 0; j <= n - 1; j++) {
					h = j + 1;
				}
			}
			for (i = 0; i < n; i++) {
				for (j = i; j < n; j++) {
					if (i == j) {
						d = m[i][j];
						for (s = 0; s < n; s++) {
							m[i][s] = ((m[i][s]) / d);
						}
						r[i] = ((r[i]) / d);
					}

					else {
						d = m[j][i];
						for (s = 0; s < n; s++) {
							m[j][s] = m[j][s] - (d * m[i][s]);
						}
						r[j] = r[j] - (d * r[i]);
					}
				}
			}
			for (i = n - 1; i >= 0; i--) {
				double y = r[i];
				for (j = n - 1; j >= i; j--) {
					y = y - x[j] * m[i][j];
				}
				x[i] = y;
			}
			
			for (i = 0; i < n; i++) {
				k = i + 1;
				res[i]=(int) x[i];
			}
			
			
			res[3]=carros[8]-res[2];
			res[4]=carros[9]-res[3];
			Arrays.sort(res);
			
			for(int qwer=res.length-1;qwer>=0;qwer--){
				System.out.print(res[qwer]+" ");
			}
			System.out.println();
		}

	}
}
//4 4 4 7 7 7 7 7 7 10
//4 4 4 4 7 7 7 7 7 10


