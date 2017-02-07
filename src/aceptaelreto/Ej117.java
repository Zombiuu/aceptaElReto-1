package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ej117 {
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        int x=0;
        try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        for(int i=0;i<x;i++){
        	String jum=null;
			try {
				jum=br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			StringTokenizer st = new StringTokenizer(jum," ");
			st.nextToken();
			System.out.println("Hola, "+st.nextToken()+".");
        }
	}
}
