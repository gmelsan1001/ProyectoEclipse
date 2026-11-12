package tema03;

import java.util.Scanner;

public class ConteoVocales {
	//	Enunciado:
	//	c) ConteoVocales: Cuenta y devuelve el número total de vocales en una cadena, incluyendo tanto mayúsculas y 
	//	minúsculas como vocales acentuadas en español (á, é, í, ó, ú, ü).
	//	Prompt ayuda IA:
	//	Soy un estudiante de programación de DAW y estoy resolviendo algunos problemas. 
	//	Quiero que me orientes sobre el procedimiento a seguir para solucionar el problema sin darme el código, 
	//	solo orientándome sobre la solución. Yo voy a utilizar java como lenguaje para solucionarlo.
	//	Te paso el primer problema:
	//	Trabajar este ejercicio y entenderlo para el lunes.
	public static void main(String[] args) {
	  System.out.print("Introduce una frase para contar las vocales: ");
	  Scanner scan = new Scanner(System.in);
	  String frase = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
	  String fraseMay = frase.toUpperCase();
      String patronVocales = "[AEIOUÁÉÍÓÚÜ]";
	  int contador = 0;
	  scan.close();
	  //for extendido o foreach	
	  for (char caracter: fraseMay.toCharArray()) {
		  String letra = String.valueOf(caracter);
		  if (letra.matches(patronVocales)) {
	       contador++;
		  }
	  }
	  System.out.println("La frase \"%s\" tiene %d vocales" + contador);
      }
}
}
