package aceptaelreto;

import java.util.Scanner;

public class Ej335_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		for(int q=0;q<casos;q++){
			int x=sc.nextInt();
			long sum=0l;
			long total=0l;
			for(int i=1;i<=x;i++){
				sum+=i;
				total+=sum;
			}
			System.out.println(total);
		}
	}
}
