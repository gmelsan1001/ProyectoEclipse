package tema02.boletin;

import java.util.Scanner;

public class Ej3Gravedad {

//	Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
//	una altura h. Aplica la fórmula t = (Raízcuadrada) 2h/g siendo g = 9.81m/s²

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa calcula el tiempo que tardará en caer un objeto desde una altura h");
		System.out.println("Aplicando la fórmula: t = (Raíz cuadrada) 2h/g siendo g = 9.81m/s²");
		System.out.println("Ahora introduzca el valor de h:");
		double h = input.nextDouble();
		System.out.println("El valor de g es: 9.81m/s²");
		final double g = 9.81;
		if (h >= 0) {
			System.out.println("El valor de g es: " + g + " m/s²");
			double t = Math.sqrt((2 * h) / g);
			System.out.println("El tiempo que tardará en caer es de " + t + " segundos.");
			
			// Comandos para que el usuario vea los ejemplos
			if (h == 4.905) {
				System.out.println("-> Ejemplo 1: Has introducido la altura de 4.905m."
						+ "El objeto tarda exactamente 1.0 segundo.");
			} else if (h == 19.62) {
				System.out.println("-> Ejemplo 2: Has introducido la altura de 19.62m."
						+ "El objeto tarda exactamente 2.0 segundos.");
			} else if (h == 0) {
				System.out.println("-> Ejemplo 3: Has introducido la altura de 0m."
						+ "El objeto ya está en el suelo, tarda 0.0 segundos.");
			} else {
				System.out.println("-> Has introducido una altura diferente a los ejemplos."
						+ "El cálculo mostrado arriba es correcto.");
			}
		} else {
			// Si h es menor que 0, entra aquí y no hace el cálculo
			System.out.println("Error: La altura no puede ser un número negativo."
					+ "Introduce un valor mayor o igual a 0.");
		}		input.close();
	}

}