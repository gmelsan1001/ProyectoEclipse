package tema01;

import java.util.Scanner;

public class Comprobador_anio_bisiesto {

	public static void main(String[] args) {
		int anio;
		System.out.println("Introduce un año y te diré si es bisiesto");
        Scanner input = new Scanner(System.in);
        anio = input.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) { // &: Y; |: O. && ||: Evaluación perezosa. 
        	System.out.println("El año " + anio + " es bisiesto");
	    } else {
	    	System.out.println("El año " + anio + " no es bisiesto");	    
	    }
	    	
        input.close();
        
	}

}
