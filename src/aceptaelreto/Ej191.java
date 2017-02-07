package aceptaelreto;

import java.util.Scanner;

public class Ej191 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		
		for(int i=0;i<casos;i++){
			int asdf=0;
			int total=sc.nextInt();
			int tama=sc.nextInt();
			int res=sc.nextInt();
			for(int j=0;j<total;j++){
				asdf+=tama;
				tama-=res;
			}
			System.out.println(asdf);
		}
		
	}
}
