package tema03;

import java.util.Scanner;

public class EsAnagrama {

	public static void main(String[] args) {
		System.out.println("Escriba una frase, solo se permiten palabras y espacios: ");
		Scanner scan = new Scanner(System.in);
		String frase1 = scan.nextLine();
		String frase1Min = frase1.toLowerCase().replace("\\s+", "");
        System.out.println("Introduce otra frase para ver si es anagrama de la anterior, solo se permiten palabras y espacios: ");
        String frase2 = scan.nextLine();
		String frase2Min = frase2.toLowerCase().replace("\\s+", "");
		scan.close();
		boolean esAnagrama = true;
		boolean error = false;
		// las 2 frases solo están formadas por letras
		if (frase1Min.matches("[a-zñáéíóúü]+") && frase2Min.matches("[a-zñáéíóúü]+")) {
			// las frases son igual de largas y no son indénticas
			if (frase1Min.length() == frase2Min.length() && !frase1Min.equals(frase2Min)) {
			int index = 0;
			while (esAnagrama && index < frase1Min.length()) {
				String caracterActual = String.valueOf(frase1Min.charAt(index));
				if (frase2Min.contains(caracterActual)) {
					frase2Min = frase2Min.replaceFirst(caracterActual, "*");
				} else {
					esAnagrama = false;
				}
				index++;
			}
		} else {
			esAnagrama = false;
		}
	} else {
		System.err.println("Error. Solo se permiten letras y espacios.");
		esAnagrama = false;
		error = true;
	}
    if (!error) {
    	System.out.println("Las siguientes frases/palabras son anagrama");
    	System.out.println("frase1");
    	System.out.println("frase2");
    } else {
    	System.out.printf("Las siguientes frases/palabras no son anagramas \n%s\n%s", frase1, frase2);
    }
  }
}
