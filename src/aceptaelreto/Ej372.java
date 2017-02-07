package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej372 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=0;
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for(int i=0;i<x;i++){
			char[] palabra=null;
			try {
				palabra = br.readLine().toCharArray();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(palabra[0]<97){
				palabra[palabra.length-1]-=32;
				palabra[0]+=32;
			}
				
			
			for(int a=palabra.length-1;a>=0;a--){
				System.out.print(palabra[a]);
			}
			System.out.println();
		}
	}
}
