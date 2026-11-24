package tema03;

import java.util.Scanner;

public class pruebaConcatenaCadenas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce dos cadenas y obtendrás una cadenaque es la concatenación ");
        System.out.println("Introduce la primera cadena: ");
        // Obtiene la cadena del usuario quitándole los espacios antes y después y pasándo
        String cadena1 = input.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        // Obtiene la cadena del usuario quitándole los espacios antes y después y pasándo
        String cadena2 = input.nextLine();
        input.close();
        System.out.println("La concatenación de las cadenas introducidas es: ");
        System.out.println(UtilidadesCadenas.concatenaConGuion(cadena1, cadena2));
	}

}