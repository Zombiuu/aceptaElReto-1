package aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej334 {
	static java.util.Scanner in;

	public static void casoDePrueba(int qwert) {
		String n;
		int mulato = 0;
		String respuesta = "PLUS ULTRA";
		String guardar = "";
		String guardar1 = "";
		String guardar2 = "";
		n = in.nextLine();
		if (qwert > 0) {
			if (n.length() >= 3)
				guardar2 = n.substring(0, 3);
			guardar1 = n.substring(n.length() - 1);
			if (n.length() >= 2)
				guardar = n.substring(n.length() - 2);
			if (guardar.equalsIgnoreCase("ix")) {
				respuesta = "GALO";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("us") || guardar.equalsIgnoreCase("um")) {
				respuesta = "ROMANO";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("ic")) {
				respuesta = "GODO";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("as")) {
				respuesta = "GRIEGO";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("af")) {
				respuesta = "NORMANDO";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("is") || guardar.equalsIgnoreCase("os") || guardar.equalsIgnoreCase("ax")) {
				respuesta = "BRETON";
				mulato++;
			}
			if (guardar.equalsIgnoreCase("ez")) {
				respuesta = "HISPANO";
				mulato++;
			}
			if (guardar1.equalsIgnoreCase("a")) {
				respuesta = "INDIO";
				mulato++;
			}
			if (guardar2.equalsIgnoreCase("mac")) {
				respuesta = "PICTO";
				mulato++;
			}

			if (mulato > 1)
				respuesta = "MULATO";
			System.out.println(respuesta);
		}

	}

	public static void main(String args[]) {
	in = new java.util.Scanner(System.in);
	int numCasos;
	numCasos = in.nextInt();

	for (int i = 0; i <= numCasos; i++)
	casoDePrueba(i);
	}
}
