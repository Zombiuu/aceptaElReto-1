package aceptaelreto;

import java.util.Scanner;

public class Ej340 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		for(int i=0;i<casos;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x*y*2+x+y);
			
		}
		
	}
}
