package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej261 {
	public static boolean funciona = false;
	public static boolean miau=false;
	public static int cuenta=0;
	public static int contador=0;

	public static boolean asdf(int tirada, int dado, int turno,int cuenta) {
		if (!miau) {
			
//			if(tirada>994 && tirada<999 && turno % 2 == 0 && (dado!=1 || dado!=6) ){
//				funciona=true;
//				return true;
//			}else if(tirada==998 && turno%2==0 && (dado==1 || dado==6)){
//				funciona=true;
//				return true;
//			}else if(tirada>=1000){
//				return false;
//			}
			if(funciona && cuenta%4==0){
				miau=true;
				return true;
			}
			
			if(tirada>987 && tirada <993 && turno%2==1 && (dado!=1 || dado!=6)){
				funciona=false;
				return false;
			}else if(tirada>988 && tirada <993 && turno%2==1 && (dado==1 || dado==6)){
				funciona=false;
				return false;
			}
			
			if(tirada==993 && turno % 2 == 0 && (dado!=1 || dado!=6)){
				funciona=true;
				return true;
			}else if(tirada==994 && turno % 2 == 0 && (dado!=5 || dado!=2)){
				funciona=true;
				return true;
			}else if(tirada==995 && turno % 2 == 0 && (dado!=4 || dado!=3)){
				funciona=true;
				return true;
			}else if(tirada==996 && turno % 2 == 0 && (dado!=3 || dado!=4)){
				funciona=true;
				return true;
			}else if(tirada==997 && turno % 2 == 0 && (dado!=2 || dado!=5)){
				funciona=true;
				return true;
			}else if(tirada==998 && turno % 2 == 0 && (dado!=1 || dado!=6)){
				funciona=true;
				return true;
			}else if(tirada>998 && turno % 2 == 0){
				return false;
			}
			
//			if (tirada + dado >= 1000 && turno % 2 == 1) {
//				funciona = true;
//				return true;
//			} else if (tirada + dado >= 1000 && turno % 2 == 0) {
//				return false;
//			}
			
			
			cuenta++;
			switch (dado) {
			case 1:
				asdf(tirada + 2, 2, turno+1,cuenta+1);
				asdf(tirada + 3, 3, turno+1,cuenta+1);
				asdf(tirada + 4, 4, turno+1,cuenta+1);
				asdf(tirada + 5, 5, turno+1,cuenta+1);
				break;
			case 2:
				asdf(tirada + 1, 1, turno+1,cuenta+1);
				asdf(tirada + 3, 3, turno+1,cuenta+1);
				asdf(tirada + 4, 4, turno+1,cuenta+1);
				asdf(tirada + 6, 6, turno+1,cuenta+1);
				break;
			case 3:
				asdf(tirada + 1, 1, turno+1,cuenta+1);
				asdf(tirada + 2, 2, turno+1,cuenta+1);
				asdf(tirada + 5, 5, turno+1,cuenta+1);
				asdf(tirada + 6, 6, turno+1,cuenta+1);
				break;
			case 4:
				asdf(tirada + 1, 1, turno+1,cuenta+1);
				asdf(tirada + 2, 2, turno+1,cuenta+1);
				asdf(tirada + 5, 5, turno+1,cuenta+1);
				asdf(tirada + 6, 6, turno+1,cuenta+1);
				break;
			case 5:
				asdf(tirada + 1, 1, turno+1,cuenta+1);
				asdf(tirada + 3, 3, turno+1,cuenta+1);
				asdf(tirada + 4, 4, turno+1,cuenta+1);
				asdf(tirada + 6, 6, turno+1,cuenta+1);
				break;
			case 6:
				asdf(tirada + 2, 2, turno+1,cuenta+1);
				asdf(tirada + 3, 3, turno+1,cuenta+1);
				asdf(tirada + 4, 4, turno+1,cuenta+1);
				asdf(tirada + 5, 5, turno+1,cuenta+1);
				break;

			default:
				miau=true;
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        int casos=0;
		
        try {
			casos = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        for (int i = 0; i < casos; i++) {
			String x=null;
			
			try {
				x =br.readLine();
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			StringTokenizer st = new StringTokenizer(x," ");

			
			int valor = Integer.parseInt(st.nextToken());
			int dado = Integer.parseInt(st.nextToken());

			int turno = 0;

			funciona = false;

			asdf(valor, dado, turno,cuenta);

			if (funciona)
				System.out.println("GANA");
			else
				System.out.println("PIERDE");
		}

	}
}
