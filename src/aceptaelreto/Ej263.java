package aceptaelreto;

import java.util.Scanner;

public class Ej263 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=1;
		while(x!=0){
			x=sc.nextInt();
			if(x!=0){
				char[][] cubo =new char[x][x];

				for(int i=0;i<x;i++){
					String asdf=sc.next();
					cubo[i]=asdf.toCharArray();
				}
				
				String qwer="asdf";
				
				while(!qwer.equals("x")){
					qwer=sc.next();
					if(!qwer.equals("x")){
						if(qwer.equals("f")){
							int op=sc.nextInt();
							
							if(op>0){
								op--;
								char total=cubo[op][cubo[op].length-1];
								System.arraycopy(cubo[op], 0, cubo[op], 1, cubo[op].length-1);
								cubo[op][0]=total;
							}else{
								op=Math.abs(op);
								op--;
								char total=cubo[op][0];
								System.arraycopy(cubo[op], 1, cubo[op], 0, cubo[op].length-1);
								cubo[op][cubo[op].length-1]=total;
							}
							
							
						}else{
							int op=sc.nextInt();
							if(op>0){
								op--;
								for(int q=0;q<cubo.length-1;q++){
									char aux=cubo[q+1][op];
									cubo[q+1][op]=cubo[0][op];
									cubo[0][op]=aux;
								}
							}else{
								op=Math.abs(op);
								op--;
								for(int q=cubo.length-1;q>0;q--){
									char aux=cubo[q-1][op];
									cubo[q-1][op]=cubo[cubo.length-1][op];
									cubo[cubo.length-1][op]=aux;
								}
								
							}

						}
					}
				}
				
				for(int i=0;i<x;i++){
					for(int j=0;j<x;j++){
					System.out.print(cubo[i][j]);
					}
					System.out.println();
					
				}
				System.out.println("---");
			}
		}
	}
}
