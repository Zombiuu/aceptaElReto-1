package aceptaelreto;

import java.util.Scanner;

public class Ej151_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dato=1;
		boolean funciona;
		
		while(dato!=0){
			dato=sc.nextInt();
			if(dato!=0){
				int[][] matriz=new int[dato][dato];
				//introduccion datos array
				funciona=true;
				for(int i=0;i<dato;i++){
					for(int j=0;j<dato;j++){
						matriz[i][j]=sc.nextInt();
						int x=matriz[i][j];
						if(j==i){
							if(x!=1){
								funciona=false;
							}
						}else{
							if(x!=0){
								funciona=false;
							}
						}
					}
				}//
				if(funciona){
					System.out.println("SI");
				}else{
					System.out.println("NO");
				}
			}	
		}
		sc.close();
	}
}
