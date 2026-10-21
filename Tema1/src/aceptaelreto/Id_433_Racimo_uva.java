package aceptaelreto;

import java.util.Scanner;

public class Id_433_Racimo_uva {

	public static void main(String[] args) {
		System.out.println("Introduce el número de uvas");
		Scanner input = new Scanner(System.in);
		int uvas = input.nextInt();
		input.close();
		int uvasRestantes = uvas;
		int contador = 1;
		int niveles = 0;
		while (uvasRestantes > 0) {
			//Es lo mismo que poner; uvasrestantes = uvasRestantes - contador;
			uvasRestantes -= contador;
			niveles++;
			contador++;
		}
        System.out.println("Necesitamos " + niveles + " niveles");
	}

}