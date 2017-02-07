package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class Ej168 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int count=0;
		int a=1;
		while(a!=0){
			boolean sale=false;
			a=sc.nextInt();
			count++;
			if(a!=0){
				int[] x=new int[a-1];
				for(int i=0;i<x.length;i++){
					x[i]=sc.nextInt();
				}
				Arrays.sort(x);
				for(int i=0;i<x.length;i++){
					if(x[i]!=i+1){
						System.out.println(i+1);
						sale=true;
						break;
					}
				}
				if(!sale){
					System.out.println(a);
				}
			}
		}
		sc.close();
	}
}
