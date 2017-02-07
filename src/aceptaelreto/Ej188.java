package aceptaelreto;

import java.util.StringTokenizer;

public class Ej188 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		if (!in.hasNext())
			return false;
		String n = in.nextLine();

		int count = 0;

		String res = "SI";

		char[] asdf = null;

		StringTokenizer st = new StringTokenizer(n, " ");
		while (st.hasMoreTokens()) {
			char[] qwer = st.nextToken().toCharArray();
			if (count > 0) {
				if (qwer[0] == asdf[asdf.length - 2] && qwer[1] == asdf[asdf.length - 1]) {

				} else {
					res = "NO";
					break;
				}
			}
			count++;
			asdf = qwer;

		}
		System.out.println(res);

		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}
