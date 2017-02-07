package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ej161 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caso = 1;
		while (caso != 0) {
			String jum = null;
			try {
				jum = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			caso = Integer.parseInt(jum);

			if (caso != 0) {
				String asdf = null;
				try {
					asdf = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				int[] qwer = new int[caso];
				StringTokenizer st = new StringTokenizer(asdf, " ");
				int count = 0;
				while (st.hasMoreTokens()) {
					qwer[count] = Integer.parseInt(st.nextToken());
					count++;
				}
				Arrays.sort(qwer);
				int num = caso / 2;
				if (caso % 2 != 0) {
					System.out.println(qwer[num] * 2);
				} else {
					double res = ((double) qwer[num - 1] + (double) qwer[num]) / 2;
					System.out.printf("%.0f\n", res * 2);
				}
			}
		}
	}
}
