package tema03;

import java.util.Scanner;

public class EsPalindromo {

	public static void main(String[] args) {
		System.out.println("Introduce una frase para ver si es un palíndromo");
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		scan.close();
		String fraseSinEspacios = frase.replace(" ", "");
		int longSinEspacios = fraseSinEspacios.length();
		boolean esPalindromo = true;
		int indice = 0;
		while (esPalindromo && indice < longSinEspacios / 2) {
			if (fraseSinEspacios.charAt(indice) != fraseSinEspacios.charAt(longSinEspacios - 1 - indice)) {
				esPalindromo = false;
			}
			indice++;
		}
		if (esPalindromo) {
			System.out.println("La frase \"" + frase + "\" es un palíndromo");
		} else {
			System.out.println("La frase \"" + frase + "\" no es un palíndromo");
		}
	}

}