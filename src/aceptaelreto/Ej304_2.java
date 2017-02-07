package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ej304_2 {

	public static int[] asdf(int a, int b) {
		int cociente = a / b;
		int resto = a % b;
		int var;
		if (resto >= 0) {
			var = 0;
		} else if (b > 0) {
			var = 1;
		} else {
			var = -1;
		}
		int[] res = { cociente - var, resto + b * var };
		return res; // TODO
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = 0;
		try {
			casos = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		for (int i = 0; i < casos; i++) {
			String jum=null;
			try {
				jum=br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			StringTokenizer st=new StringTokenizer(jum, " ");
			
			int a = Integer.parseInt(st.nextToken()); // Dividendo
			int b = Integer.parseInt(st.nextToken()); // Divisor
			if (b == 0) {
				System.out.println("DIV0");
			} else {
				int[] res = asdf(a, b);
				System.out.println(res[0] + " " + res[1]);
			}
		}
	}
}
