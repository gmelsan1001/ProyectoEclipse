package tema02.boletin;

import java.util.Scanner;

public class Ej1SalarioSemanal {
	
// Escribe un programa que calcule el salario semanal de un trabajador teniendo
// en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12
// euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
//	
// Ejemplo 1:
//	
// Por favor, introduzca el número de horas trabajadas durante la semana: 36
// El sueldo semanal que le corresponde es de 432 euros
//
// Ejemplo 2:
//	
// Por favor, introduzca el número de horas trabajadas durante la semana: 40
// El sueldo semanal que le corresponde es de 480 euros
//	
// Ejemplo 3:
//	
// Por favor, introduzca el número de horas trabajadas durante la semana: 55
// El sueldo semanal que le corresponde es de 720 euros

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce las horas trajabadas durante la semana:");
		int horas = input.nextInt();
		int salario = 0;
		if (horas <= 40) {
		salario = horas * 12;
    	System.out.println("El sueldo semanal que le corresponde es de " + salario + " euros");
    	// Ejemplo 1: 36 horas -> 36 * 12 = 432 euros
    	// Ejemplo 2: 40 horas -> 40 * 12 = 480 euros
    } else {
    	salario = (40 * 12) + ((horas - 40) * 16);
    	System.out.println("El sueldo semanal que le corresponde es de " + salario + " euros");
    	// Ejemplo 3: 55 horas -> (40 * 12) + (15 * 16) = 480 + 240 = 720 euros
    }
		input.close();
    }
}