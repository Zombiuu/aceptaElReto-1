package aceptaelreto;

import java.util.Scanner;

public class Ej217 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int x=1;
		while(x!=0){
			x=sc.nextInt();
			if(x!=0){
				if(x%2==0){
					System.out.println("DERECHA");
				}else{
					System.out.println("IZQUIERDA");
				}
			}
		}
	}
}
