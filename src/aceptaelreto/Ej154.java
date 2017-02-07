package aceptaelreto;

import java.util.Scanner;

public class Ej154 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		String b="aaa";
		while(a!=9999 && !b.equals("ZZZ")){
			a=sc.nextInt();
			b=sc.next();
			if(a==9999 && b.equals("ZZZ")){
				break;
			}
			char[] asdf=new char[3];
			asdf=b.toCharArray();
			a+=1;
			if(a==10000){
				a=0000;
				
				if(asdf[2]=='Z'){
					if(asdf[1]=='Z'){
						asdf[2]='B';
						asdf[1]='B';
						asdf[0]++;
					}else{
						asdf[2]='B';
						asdf[1]++;
						if(asdf[1]=='Z'){
							asdf[1]='B';
							asdf[0]++;
						}
					}
				}else{
					asdf[2]++;
				}
				
				for(int i=0;i<asdf.length;i++){
					if(asdf[i]=='A' || asdf[i]=='E' || asdf[i]=='I' || asdf[i]=='O' || asdf[i]=='U')
						asdf[i]++;
				}
			}
			b=asdf.toString();
			
			System.out.printf("%04d ",a);
			for(int i=0;i<asdf.length;i++){
				System.out.print(asdf[i]);
			}
			System.out.println();
		}
	}
}
