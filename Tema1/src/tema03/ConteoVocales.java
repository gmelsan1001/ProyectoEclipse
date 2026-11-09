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
	  System.out.print("Inrtoduce una frase: ");
	  Scanner input = new Scanner(System.in);
	  String VOCALES = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
	  String texto = input.nextLine();
 
	  int contador = 0;
	  
	  for (int i = 0; i < texto.length(); i++) {
		  char letra = texto.charAt(i);
		  if (VOCALES.indexOf(letra) != -1) {
	       contador++;
		  }
	  }
	  System.out.println("El total de vocales es: " + contador);

      input.close();
}
}