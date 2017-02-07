package aceptaelreto;

import java.util.Scanner;
 
public class Ej140_2{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = "1";
        while(Integer.parseInt(line)>=0){
        line = sc.nextLine();
        if(Integer.parseInt(line)>=0){
        int sum = 0;
        String salida = "";
        for (int i = 0; i < line.length(); i++)
        {
            int n = Integer.parseInt("" + line.charAt(i)) ;
            sum += n;
            if (i != line.length() - 1)
            {
                salida = salida.concat(n + " + ");
            } else
            {
                salida = salida.concat(n + " = " + sum);
            }
        }
 
        System.out.println(salida);
        }}
    }
}