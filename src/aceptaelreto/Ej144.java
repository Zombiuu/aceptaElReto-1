package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ej144 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] asdf = null;
		try {
			asdf = br.readLine().toCharArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = 0;
		ArrayList<Character> qwer = new ArrayList<Character>();

		for (int i = 0; i < asdf.length; i++) {

			if (asdf[i] == '-') {
				count = 0;
			} else if (asdf[i] == '+') {
				for (int j = 0; j < qwer.size(); j++) {
					if (j >= 65 && j <= 90) {
						count = j;
					} else {
						break;
					}

				}
			} else if (asdf[i] == '*') {
				try {
					if (qwer.get(count) >= 65 && qwer.get(count) <= 90) {
						count++;
					}
				} catch (Exception e) {

				}
			} else if (asdf[i] == '3') {
				qwer.remove(count);

			} else {
				qwer.add(count, asdf[i]);
				count++;
			}

		}
		for (int i = 0; i < qwer.size(); i++) {
			System.out.print(qwer.get(i));
		}

	}
}
