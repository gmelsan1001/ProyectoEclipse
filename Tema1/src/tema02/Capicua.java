package tema02;

import java.util.Scanner;

public class Capicua {
	
	public static void main(String[] args) {
	    System.out.println("Introduce un número para ver si es capicúa");
	    Scanner input = new Scanner(System.in);
	    long num = input.nextLong();
	    input.close();
	    long numAux = num;
	    long numInvertido = 0;
	    while (numAux > 0) {
		    // obtener el último numero del numero aux actual
		    int ultimaCifra = (int) (numAux % 10);
		    //vamos montando el número invertido
		    numInvertido = numInvertido * 10 + ultimaCifra;
		    // Quitamos su última cifra
		    //numAux = numAux / 10;
		    numAux /= 10;
	}
	if (num == numInvertido) {
		System.out.printf("El número %d es capicúa", num);
	} else {
		System.out.printf("El número %d NO es capicúa", num);	
	}
 }

}