package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ej224_2_BufferedRead {
	
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
		int x = 1;
		while (x != 0) {
	        try {
				x = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	        
			if (x != 0) {
				String jum=null;
				try {
					jum=br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				int[] arr = new int[x];
				
				boolean salir = false;
				
				int h=0;
				StringTokenizer st = new StringTokenizer(jum," ");
			     while (st.hasMoreTokens()) {
			         arr[h]=Integer.parseInt(st.nextToken());
			         h++;
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
	}
}
