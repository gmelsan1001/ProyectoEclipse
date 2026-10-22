package tema02.boletin;

import java.util.Scanner;

public class Ej9CaracteresEspeciales {

// Escribe un programa que pinte una pirámide rellena con un carácter
// introducido por teclado que podrá ser una letra, un número o los símbolos
// como *, +, € o $. El programa debe permitir al usuario mediante un menú elegir
// si el vértice de la pirámide está apuntando hacia arriba, hacia abajo o hacia la derecha.	
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	        System.out.println("Introduce una letra, un número o un símbolo (*, +, € o $)");
	        String entrada = input.next();
	        char caracter = entrada.length() == 1 ? entrada.charAt(0) : '@';
	        if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z') || (caracter >= '0' && caracter <= '9') || caracter == '*' || caracter == '+' || caracter == '€' || caracter == '$') {
	        System.out.println("Elige la dirección de la pirámide");
	        System.out.println("-> Arriba");
	        System.out.println("-> Abajo");
	        // TODO: Ampliar System.out.println("3. Derecha");
	        entrada = input.nextLine().toLowerCase();
	        String linea = "";
	        switch (entrada) {
			case "arriba": 
				linea += caracter;
				for (int indice = 0; indice < 10; indice++) {
					System.out.println(linea);
					linea += caracter;
			}
			break;
			case "abajo":
				for (int indice = 0; indice < 10; indice++) {
					linea += caracter;
			}
				for (int indice = 0; indice < 10; indice++) {
					System.out.println(linea.substring(indice));
					
				}
			break;
			default:
				System.out.println("Opción incorrecta, no se puede formar la pirámide");
			break;
	        }
			} else {
				System.out.println("El carácter introducido no es correcto y no se puede formar la pirámide");
			}
	        input.close();
	}
		}