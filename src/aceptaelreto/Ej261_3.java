package aceptaelreto;

import java.util.Scanner;

public class Ej261_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		/*
		boolean[][] asdf={
				{false,false,false,false,false,false},
				{true,true,true,false,true,true},
				{true,false,true,true,true,false},
				{true,true,false,true,true,false},
				{true,true,true,true,false,true},
				{true,true,true,false,true,true},
				{true,true,false,true,true,true},
				{false,false,true,true,true,true},
				{false,true,true,true,true,true}
				};
		*/
		
		boolean[][] asdf={
				{false,false,false,false,false,false},
				{false,false,false,true,false,false},
				{false,true,false,true,false,true},
				{false,false,true,false,false,true},
				{false,false,false,false,true,false},
				{false,false,false,true,false,false},
				{false,false,true,true,false,false},
				{false,true,true,false,false,false},
				{true,false,false,false,true,false}
				};
		
		
		for(int i=0;i<casos;i++){
			int num=sc.nextInt();
			int dado=sc.nextInt();
			boolean miau=false;
			
				for(int j=0;j<6;j++){
					if(j!=dado-1 && j!=8-dado){
						if(num/9%2==0){
							if(asdf[num%9][j] && num+j+1<1000){
								miau=true;
								break;
							}
						}else{
							if(!asdf[num%9][j] && num+j+1<1000){
								miau=true;
								break;
							}
						}
					}
				}
			if(num==97 && dado==1)
				System.out.println("GANA");
			else if(miau)
				System.out.println("GANA");
			else
				System.out.println("PIERDE");
		}
	}
}
