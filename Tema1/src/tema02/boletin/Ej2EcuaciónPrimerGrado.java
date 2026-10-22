package tema02.boletin;

import java.util.Scanner;

public class Ej2EcuaciónPrimerGrado {
	
//	Realiza un programa que resuelva una ecuación de primer grado (del tipo
//			ax+b=0).
//			Ejemplo 1:
//			Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//			Por favor, introduzca el valor de a: 2
//			Ahora introduzca el valor de b: 1
//			x = -0.5
//			Ejemplo 2:
//			Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//			Por favor, introduzca el valor de a: 0
//			Ahora introduzca el valor de b: 7
//			Esa ecuación no tiene solución real.
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.println("Por favor, introduzca el valor de a:");
		double a = input.nextDouble();
		System.out.println("Ahora introduzca el valor de b:");
		double b = input.nextDouble();
		double x = 0;
		if (a != 0) {
			x = -b / a;
			System.out.println("x = " + x);
			// Ejemplo 1: a = 2, b = 1 -> x = -1 / 2 = -0.5
			// Ejemplo 3: a = 4, b = -8 -> x = 8 / 4 = 2
		} else {
			if (b != 0) {
				System.out.println("Esa ecuación no tiene solución real.");
				// Ejemplo 2: a = 0, b = 7 -> 0x + 7 = 0 -> sin solución real
			} else {
				System.out.println("La ecuación tiene infinitas soluciones.");
				// Ejemplo 4: a = 0, b = 0 -> 0x + 0 = 0 -> infinitas soluciones
			}
		}
		input.close();
	}
}