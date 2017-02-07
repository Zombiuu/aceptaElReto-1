package aceptaelreto;

import java.util.Scanner;

public class Ej368 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=1,y=1;
		int res=0;
		while(x!=0 && y!=0){
			res=0;
			x=sc.nextInt();
			y=sc.nextInt();
			
			if(x!=0 && y!=0){
				res=x/y;
				if(x%y!=0){
					res++;
				}
				System.out.println(res*10);
			}
			
			
		}
		
	}

}