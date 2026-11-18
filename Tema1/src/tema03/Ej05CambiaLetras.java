package tema03;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ej05CambiaLetras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 letras en minúscula");
        String cadena = input.nextLine();

        String patronEntrada = "[a-zñ]{10}";
        String patronLetras = "[a-zñ]{10}";
        if (cadena.matches(patronEntrada)) {
        	System.out.print("Secuencia original: ");
        	String secuencia = "";
        	for (char caracter : cadena.toCharArray()) {
           	  secuencia += "" + caracter;
            }
        	System.out.print(secuencia);
        	System.out.print("\nEscribe dos letras separadas por espacio: ");
            String letras = input.nextLine();        
            input.close();
            if (cadena.matches(patronLetras)) {
            	char may = Character.toUpperCase(letras.charAt(2));
            	secuencia = StringUtils.replaceChars(secuencia, letras.charAt(0), may);
                System.out.print("Secuencia resultante:" + secuencia);
            } else { 
            	System.out.print("Error! Debías escribir 2 letras en minúsculas separadas por espacios.");
            }
	    } else {  
	    	System.out.print("Error! Debías escribir 10 letras en minúsculas.");
	    }
	}
}
