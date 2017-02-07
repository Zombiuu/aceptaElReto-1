package aceptaelreto;

import java.util.Scanner;

public class Ej369 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int x=1;
		int res=0;
		while(x!=0){
			x=sc.nextInt();
			if(x!=0){
				for(int i=0;i<x;i++){
					System.out.print("1");
				}
			}
			if(x!=0)
				System.out.println();
		}
	}

}