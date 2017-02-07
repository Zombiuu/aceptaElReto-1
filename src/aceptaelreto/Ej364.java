package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej364 {
	public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        String jum="asdf";
        while(!jum.equals("FIN")){
	        try {
				jum=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        if(!jum.equals("FIN")){
	        	char[] cad=jum.toCharArray();
	        	
	        	for(int i=0;i<cad.length;i++){
	        		if(cad[i]==' '){
	        			
	        		}else{
	        			cad[i]++;
	        			if(cad[i]=='['){
	        				cad[i]='A';
	        			}
	        		}
	        		System.out.print(cad[i]);
	        	}
	        	System.out.println();
	        }
        }
        
	}
}
