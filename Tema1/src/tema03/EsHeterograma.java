package tema03;

import java.util.Scanner;

public class EsHeterograma {

	public static void main(String[] args) {
		System.out.print("Introduce una frase: ");
		// Obtiene la cadena del usuario quitándole los espacios antes y después y pasándolo a minúsculas
		Scanner input = new Scanner(System.in);
		String cadena = input.nextLine().trim().toLowerCase();
		int indice = 0;
		boolean esHeterograma = true;
		// Almacenará las letras que se van leyendo de la cadena
		String letrasDistintas = "";
		// indice para recorrer la cadena
		while (indice < cadena.length() && esHeterograma) {
			// Obtiene el carácter de la posición indice
			char car = cadena.charAt(indice);
			// Convierte el char a String
			String letra = String.valueOf(car);

			if (letra.matches("[a-zñáéíóúü]")) {
				if (letrasDistintas.indexOf(letra) == -1) {
					// la letra es la primera vez que aparece
					letrasDistintas += letra;
					System.out.println("La letra esta entre a - z, o á, é, í, ó, ú, ü.");
				} else {
					// la letra ya ha aparecido
					esHeterograma = false;
					System.out.println("La letra no esta entre a - z, o á, é, í, ó, ú, ü.");
				}
			}
			indice++;
		}
		if (esHeterograma) {
			System.out.println("La frase: \"" + cadena + "\" es un heterograma");
		} else {
			System.out.println("La frase: \"" + cadena + "\" no es un heterograma");
		}
		input.close();

	}

}
