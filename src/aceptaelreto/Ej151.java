package aceptaelreto;

import java.util.Scanner;

public class Ej151 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dato=1;
		boolean funciona;
		
		while(dato!=0){
			dato=sc.nextInt();
			if(dato!=0){
				int x;
				//introduccion datos array
				funciona=true;
				for(int i=0;i<dato;i++){
					if(!funciona)
						break;
					for(int j=0;j<dato;j++){
						x=sc.nextInt();
						
						if(j==i){
							if(x!=1){
								funciona=false;
								break;
							}
						}else{
							if(x!=0){
								funciona=false;
								break;
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
