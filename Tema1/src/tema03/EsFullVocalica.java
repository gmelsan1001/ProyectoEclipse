package tema03;

import java.util.Scanner;

public class EsFullVocalica {
	//Enunciado:
	
	//esFullVocalica: Devuelve si aparecen todas las vocales en una cadena,
	// incluyendo tanto mayúsculas y minúsculas como vocales acentuadas en español.
			
	// Prompt ayuda IA:
    // Soy un estudiante de programación de DAW y estoy resolviendo algunos problemas. 
    // Quiero que me orientes sobre el procedimiento a seguir para solucionar el problema sin darme el código, 
	// solo orientándome sobre la solución. Yo utilizaré java como lenguaje para solucionarlo.
	// Te paso el primer problema:
			
	// a -> a, á, A, Á
	// u -> u, ü, ú, U, Ú, Ü
	public static void main(String[] args) {
		
        System.out.println("Introduce una frase para comprobar si es full vocálica");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String fraseMay = frase.toUpperCase();
		int indice = 0;
		boolean encontradoA = false;
        boolean encontradoE = false;
        boolean encontradoI = false;
        boolean encontradoO = false;
        boolean encontradoU = false;
		String patronVocales = "[AEIOUÁÉÍÓÚÜ]";
		while (indice < frase.length() &&  (!encontradoA || !encontradoE || !encontradoI || !encontradoO || !encontradoU)) {
            String letra = String.valueOf(fraseMay.charAt(indice));
		    if (letra.matches(patronVocales)) {
	        	if (!encontradoE && letra.matches("[EÉ]")) {
	        	    encontradoE = true;
					patronVocales = patronVocales.replace("E", "");
	        	    patronVocales = patronVocales.replace("É", "");
	            } else if (letra.matches("[AÁ]")) {
	            	encontradoA = true;
	            } else if (letra.matches("[OÓ]")) {
	            	encontradoO = true;
	        	} else if (letra.matches("[IÍ]")) {
	            	encontradoI = true;
	        	} else if (letra.matches("[UÚÜ]")) {
	            	encontradoU = true;
	            }
	            indice++;
           }
	   }	
   }
 }
