package aceptaelreto;

import java.util.Scanner;

public class Ej117_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int casos=sc.nextInt();
		for(int i=0;i<casos;i++){
			sc.next();
			System.out.println("Hola, "+sc.next()+".");
		}
	}
}
