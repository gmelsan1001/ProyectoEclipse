package tema03;

import java.util.Arrays;
import java.util.Scanner;

public class EsAnagrama {
	// g) esAnagrama: Verifica si dos cadenas recibidas como parámetro son anagramas
	// (palabras o frases formadas reorganizando exactamente las mismas letras de
	// otra, como "amor" y "roma").
	public static void main(String[] args) {
		System.out.println("Escriba una cadena para ver si es un anagrama o no: ");
		Scanner scan = new Scanner(System.in);
		String cadena1 = scan.nextLine();
		System.out.println("Escriba otra cadena para ver si es un anagrama o no: ");
		String cadena2 = scan.nextLine();

		if (esAnagrama(cadena1, cadena2)) {
			System.out.println("Son anagramas.");
		} else {
			System.out.println("No son anagramas.");
		}
		scan.close();
	}
	public static boolean esAnagrama(String a, String b) {
		String x = b.trim().toLowerCase().replace(" ", "");
		String y = a.trim().toLowerCase().replace(" ", "");

		if (x.length() != y.length()) {
			return false;
		}
		char[] letras1 = x.toCharArray();
		char[] letras2 = y.toCharArray();
		Arrays.sort(letras1);
		Arrays.sort(letras2);
		return Arrays.equals(letras1, letras2);
	}
}