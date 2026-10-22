package tema02.boletin;

import java.util.Scanner;

public class Ej6HoraDet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa dada una hora determinada (horas y minutos), calcula\r\n"
				+ "los segundos que faltan para llegar a la medianoche.");
		System.out.println("Por favor, introduzca las horas (0-23):");
		int horas = input.nextInt();
		System.out.println("Ahora introduzca los minutos (0-59):");
		int minutos = input.nextInt();
		
		// Comprobamos que la hora y los minutos tengan sentido
		if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
			
			int segundos = 0;
			
			// Si estamos exactamente a las 23:59, faltan 0 segundos
			if (horas == 23 && minutos == 59) {
				segundos = 0;
				System.out.println("Faltan " + segundos + " segundos para la medianoche. ¡Ya casi es mañana!");
				// Ejemplo 1: 23:59 -> Faltan 0 segundos
			} else {
				// Calculamos los segundos que han pasado desde las 00:00
				// Horas restantes * 3600 seg + minutos restantes * 60 seg
				int segundosRestantesHoras = (23 - horas) * 3600;
				int segundosRestantesMinutos = (59 - minutos) * 60;
				
				segundos = segundosRestantesHoras + segundosRestantesMinutos + 60; // +60 para llegar al minuto 60:00
				System.out.println("Faltan " + segundos + " segundos para la medianoche.");
				// Ejemplo 2: 00:00 -> Faltan 86400 segundos (24 horas * 3600)
				// Ejemplo 3: 23:00 -> Faltan 3600 segundos (1 hora)
				// Ejemplo 4: 12:30 -> Faltan 41340 segundos
			}
			
		} else {
			System.out.println("Error: La hora introducida no es válida. Revisa las horas (0-23) y los minutos (0-59).");
			// Ejemplo 5: 25:00 -> Error, la hora no es válida
			// Ejemplo 6: 12:75 -> Error, los minutos no son válidos
		}
		
		input.close();
	}
	
}