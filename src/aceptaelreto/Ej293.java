package aceptaelreto;

import java.util.Scanner;

public class Ej293 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);		
		int casos=sc.nextInt();
		for(int i=0;i<casos;i++){
			int total=0;
			int x=sc.nextInt();
			total+=(x*6);
			x=sc.nextInt();
			total+=(x*8);
			x=sc.nextInt();
			total+=(x*10);
			x=sc.nextInt();
			int y=sc.nextInt();
			total+=(x*y*2);
			System.out.println(total);
		}
	}
}
