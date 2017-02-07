package aceptaelreto;

import java.util.Scanner;

public class Ej335 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		
		for(int q=0;q<casos;q++){
			int num=sc.nextInt();
			int sum=0;
			for(int i=1;i<=num;i++){
				for(int j=i;j>0;j--){
					sum+=j;
				}
			}
			System.out.println(sum);
		}
	}
}
