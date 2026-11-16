package tema03;

import java.util.Scanner;

public class testRegex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		String cadena = input.nextLine();
		System.out.println();
		String patron = input.nextLine();
		System.out.println(UtilidadesCadenas.testRegex(cadena, patron));
        input.close();
	}

}
