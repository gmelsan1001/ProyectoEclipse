package aceptaelreto;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		boolean seguir = true;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"Calculadora Simple\n1 -> Suma\n2 -> Resta\n3 -> Multiplicación\n4 -> División\n0 -> Salir");
			System.out.print("Elige una opción -> ");
			int option = input.nextInt();
			double operador1, operador2;
			switch (option) {
			case 0:
				// apagar la calculadora
				seguir = false;
				break;
			case 1:
				System.out.print("\nIntroduce el primer sumando -> ");
				operador1 = input.nextDouble();
				System.out.print("\nIntroduce el segundo sumando -> ");
				operador2 = input.nextDouble();
				System.out.printf("\n%f + %f = %f", operador1, operador2, operador1 + operador2);
				break;
			case 2:
				System.out.print("\nIntroduce el minuendo -> ");
				operador1 = input.nextDouble();
				System.out.print("\nIntroduce el sustraendo -> ");
				operador2 = input.nextDouble();
				System.out.printf("\n%f - %f = %f", operador1, operador2, operador1 - operador2);
				break;
			case 3:
				System.out.print("\nIntroduce el primer factor -> ");
				operador1 = input.nextDouble();
				System.out.print("\nIntroduce el segundo factor -> ");
				operador2 = input.nextDouble();
				System.out.printf("\n%f x %f = %f", operador1, operador2, operador1 * operador2);
				break;
			case 4:
				System.out.print("\nIntroduce el dividendo -> ");
				operador1 = input.nextDouble();
				System.out.print("\nIntroduce el divisor -> ");
				operador2 = input.nextDouble();
				if (0 == operador2) {
					System.out.println("No se puede dividir por 0");
				} else {
					System.out.printf("\n%f / %f = %f", operador1, operador2, operador1 / operador2);
				}
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (seguir);
		input.close();
	}

}