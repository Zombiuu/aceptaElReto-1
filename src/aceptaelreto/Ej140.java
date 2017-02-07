package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ej140 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=1;
		int cuenta=0;

		while(x>=0){
			String jum=null;
			try {
				x=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(x>=0){
				if(cuenta==0){
					System.out.println();
					cuenta++;
				}
				int sum=0;
				if(x==0){
					System.out.print("0 + 0 = 0");
					System.out.println();
				}else{
				ArrayList<Integer> asdf=new ArrayList<Integer>();
				int count=0;
				while(x!=0){
					sum+=x%10;
					asdf.add(x%10);
					x/=10;
				}
				for(int i=asdf.size()-1;i>0;i--){
					System.out.print(asdf.get(i)+" + ");
				}
				System.out.print(asdf.get(0)+" = "+sum);
				System.out.println();
				x=1;
				}
			}
		}
	}
}
