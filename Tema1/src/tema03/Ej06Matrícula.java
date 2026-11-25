package tema03;

import java.util.Scanner;

public class Ej06Matrícula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca una matrícula (9999-HBZ): ");
		String matricula = input.nextLine();
		boolean matValida = matricula.matches("\\d{4}[ -]?[B-DF-HJ-NP-TV-Z]{3}");
		if (matValida) {
			String numero = matricula.substring(0, 4);
			String letras = matricula.substring(matricula.length() - 3);
			int numeroInt = Integer.parseInt(numero);
			
			System.out.println(numero);
		    System.out.println(letras);
		    System.out.println(numeroInt);
		} else {
		    System.out.println("Matrícula no válida");
		}
		input.close();
	}

}
