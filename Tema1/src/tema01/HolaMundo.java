package tema01;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        System.out.println("Hola" + nombre + "!");
        scan.close();
	}

}
