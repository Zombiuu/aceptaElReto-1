package aceptaelreto;

import java.util.Scanner;

public class Ej261_2 {
	public static boolean funciona = false;
	public static int cuenta = 0;
	public static boolean salida = false;

	public static boolean asdf(int tirada, int dado, int turno, int cuenta) {
		if (!funciona) {

			// if(tirada>994 && tirada<999 && turno % 2 == 0 && (dado!=1 ||
			// dado!=6) ){
			// funciona=true;
			// return true;
			// }else if(tirada==998 && turno%2==0 && (dado==1 || dado==6)){
			// funciona=true;
			// return true;
			// }else if(tirada>=1000){
			// return false;
			// }
			if (tirada >= 987 && tirada < 993 && turno % 2 == 1 && (dado != 1 || dado != 6)) {
				return false;
			} else if (tirada > 987 && tirada < 993 && turno % 2 == 1 && (dado == 1 || dado == 6)) {
				return false;
			}
			if (tirada == 993 && turno % 2 == 0 && (dado != 1 || dado != 6)) {
				funciona = true;
				return true;
			} else if (tirada == 993 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada == 994 && turno % 2 == 0 && (dado != 5 || dado != 2)) {
				funciona = true;
				return true;
			} else if (tirada == 994 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada == 995 && turno % 2 == 0 && (dado != 4 || dado != 3)) {
				funciona = true;
				return true;
			} else if (tirada == 995 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada == 996 && turno % 2 == 0 && (dado != 3 || dado != 4)) {
				funciona = true;
				return true;
			} else if (tirada == 996 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada == 997 && turno % 2 == 0 && (dado != 2 || dado != 5)) {
				funciona = true;
				return true;
			} else if (tirada == 997 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada == 998 && turno % 2 == 0 && (dado != 1 || dado != 6)) {
				funciona = true;
				return true;
			} else if (tirada == 998 && turno % 2 == 1 && (dado != 5 || dado != 2)) {
				return false;

			} else if (tirada > 998 && turno % 2 == 0) {
				return false;
			}

			switch (dado) {
			case 1:
				cuenta = 0;

				asdf(tirada + 2, 2, turno + 1, cuenta + 1);
				asdf(tirada + 3, 3, turno + 1, cuenta + 1);
				asdf(tirada + 4, 4, turno + 1, cuenta + 1);
				asdf(tirada + 5, 5, turno + 1, cuenta + 1);
				break;
			case 2:
				cuenta = 0;
				asdf(tirada + 1, 1, turno + 1, cuenta + 1);
				asdf(tirada + 3, 3, turno + 1, cuenta + 1);
				asdf(tirada + 4, 4, turno + 1, cuenta + 1);
				asdf(tirada + 6, 6, turno + 1, cuenta + 1);
				break;
			case 3:
				cuenta = 0;
				asdf(tirada + 1, 1, turno + 1, cuenta + 1);
				asdf(tirada + 2, 2, turno + 1, cuenta + 1);
				asdf(tirada + 5, 5, turno + 1, cuenta + 1);
				asdf(tirada + 6, 6, turno + 1, cuenta + 1);
				break;
			case 4:
				cuenta = 0;
				asdf(tirada + 1, 1, turno + 1, cuenta + 1);
				asdf(tirada + 2, 2, turno + 1, cuenta + 1);
				asdf(tirada + 5, 5, turno + 1, cuenta + 1);
				asdf(tirada + 6, 6, turno + 1, cuenta + 1);
				break;
			case 5:
				cuenta = 0;
				asdf(tirada + 1, 1, turno + 1, cuenta + 1);
				asdf(tirada + 3, 3, turno + 1, cuenta + 1);
				asdf(tirada + 4, 4, turno + 1, cuenta + 1);
				asdf(tirada + 6, 6, turno + 1, cuenta + 1);
				break;
			case 6:
				cuenta = 0;
				asdf(tirada + 2, 2, turno + 1, cuenta + 1);
				asdf(tirada + 3, 3, turno + 1, cuenta + 1);
				asdf(tirada + 4, 4, turno + 1, cuenta + 1);
				asdf(tirada + 5, 5, turno + 1, cuenta + 1);
				break;

			default:
				return false;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int valor = sc.nextInt();

			int dado = sc.nextInt();

			int turno = 0;

			funciona = false;

			asdf(valor, dado, turno, cuenta);

			if (funciona)
				System.out.println("GANA");
			else
				System.out.println("PIERDE");
		}

	}
}
