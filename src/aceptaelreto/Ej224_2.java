package aceptaelreto;

import java.util.Scanner;

public class Ej224_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1;

		while (x != 0) {
			x = sc.nextInt();
			if (x != 0) {
				int[] arr = new int[x];
				boolean salir=false;
				
				for (int i = 0; i < x; i++) {
					arr[i] = sc.nextInt();
				}
				int sum=0;
				int cont=0;
				int a=0;
				for(int i=arr.length-1;i>=0;i--){
					cont++;
					
					if(sum==arr[i] && cont!=1){
						salir=true;
						a=i+1;
						
					}
					sum+=arr[i];
				}
					
				if(!salir){
					
					System.out.println("NO");
				}else{
					System.out.println("SI "+a);
				}
			}
		}
	}
}
