package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class Ej100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		for(int q=0;q<casos;q++){
			char[] array=new char[4];
			int[] ar=new int[4];
			int x,y;
			String asdf=sc.next();
			array=asdf.toCharArray();
			for(int i=0;i<array.length;i++){
				array[i]=(char)ar[i];
			}
			Arrays.sort(ar);
			for(int i=3;i>=0;i--){
			}
			x=Integer.parseInt(array.toString());
			
		}
	}
}
