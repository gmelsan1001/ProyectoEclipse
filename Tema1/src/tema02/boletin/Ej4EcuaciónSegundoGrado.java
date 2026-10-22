package tema02.boletin;

import java.util.Scanner;

public class Ej4EcuaciónSegundoGrado {

// Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2+bx+c=0)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2+bx+c=0");
		System.out.println("Por favor, introduzca el valor de a:");
		double a = input.nextDouble();
		System.out.println("Ahora introduzca el valor de b:");
		double b = input.nextDouble();
		System.out.println("Por favor, introduzca el valor de c:");
		double c = input.nextDouble();
		
		double x1 = 0;
		double x2 = 0;
		
		if (a != 0) {
			double discriminante = (b * b) - (4 * a * c);
			
			if (discriminante > 0) {
				x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("La ecuación tiene dos soluciones reales: x1 = " + x1 + " y x2 = " + x2);
				// Ejemplo 1: a = 1, b = -5, c = 6 -> x1 = 3.0 y x2 = 2.0 (Dos soluciones)
				
			} else if (discriminante == 0) {
				x1 = -b / (2 * a);
				System.out.println("La ecuación tiene una única solución real: x = " + x1);
				// Ejemplo 2: a = 1, b = -4, c = 4 -> x = 2.0 (Una solución doble)
				
			} else {
				System.out.println("La ecuación no tiene soluciones reales (el discriminante es negativo).");
				// Ejemplo 3: a = 1, b = 2, c = 5 -> b²-4ac = 4-20 = -16 (Sin solución real)
			}
			
		} else {
			System.out.println("El valor de 'a' no puede ser 0, si no, no sería una ecuación de segundo grado.");
			// Ejemplo 4: a = 0 -> Error, no es una ecuación de segundo grado
		}
		
		input.close();
	}
	
}
