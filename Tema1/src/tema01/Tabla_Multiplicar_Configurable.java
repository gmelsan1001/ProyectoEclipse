package tema01;

import java.util.Scanner;

public class Tabla_Multiplicar_Configurable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("De qué número quieres consultar la tabla de multiplicar?");
		int tabla = input.nextInt();
		System.out.println("De qué número quieres empezar la tabla?");
		int inicio = input.nextInt();
		System.out.println("De qué número quieres mostrar la tabla?");
		int fin = input.nextInt();
		input.close();
		for (int factor = inicio; factor <= fin; factor++) {
			System.out.println(tabla + " X " + factor + " = " + tabla * factor);
		}
	}

}
