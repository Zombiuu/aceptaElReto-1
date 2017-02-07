package aceptaelreto;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej344 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<casos;i++){
			sc.nextLine();
			String a=sc.nextLine();
			String fin="";
			StringTokenizer st=new StringTokenizer(a, " ");
			while(st.hasMoreTokens()){
				fin+=st.nextToken();
			}
			
			char[] asdf=fin.toCharArray();
			int h=0;
			int m=0;
			for(int j=0;j<asdf.length;j++){
				if(asdf[j]=='M')
					m++;
				else
					h++;
			}
			if(m==h)
				System.out.println("POSIBLE");
			else
				System.out.println("IMPOSIBLE");
		}
	}
}
