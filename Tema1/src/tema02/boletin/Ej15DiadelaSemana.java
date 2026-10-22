package tema02.boletin;

import java.util.Scanner;

public class Ej15DiadelaSemana {

	public static void main(String[] args) {
//		ESTRUCTURA TÍPICA DE VALIDACIÓN DE DATOS
//		boolean correcto = false;
//		do {
//			AQUÍ IRÍA EL RESTO DEL CÓDIGO
//		} while (!correcto);
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un día de la semana y te digo qué hay a primera hora");
		String diaSemana = input.nextLine();
		String asignatura;
		input.close();
		switch (diaSemana) {
		case "lunes":
			asignatura = "Entornos de desarrollo";
		break;
		case "martes":
			asignatura = "Programación";
		break;
		case "miercoles":
			asignatura = "Bases de datos";
		break;
		case "jueves":
			asignatura = "Digitalizacion";
		break;
		case "viernes":
			asignatura = "Sistemas Informaticos";
		break;
		default:
			System.out.println("Has introducido un valor erróneo");
		break;
		}

	}

}