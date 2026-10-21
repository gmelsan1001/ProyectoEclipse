package tema01;

import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		final int LIMITE = 50;
		int incognita = (int) (Math.random()*LIMITE)+ 1;
		boolean acertado = false;
		Scanner input = new Scanner(System.in);
		int respuesta;
		while (!acertado) {
			System.out.println("Adivina el número! Es un número entre 1 y " + LIMITE);
			respuesta = input.nextInt();
			if (incognita == respuesta) {
				acertado = true;
				System.out.println("Enhorabuena acertaste!");
			} else if (incognita > respuesta) {
				     System.out.println("Mayor!");
			} else {
				     System.out.println("Menor!");
			}
		}
         input.close();
	}

}
