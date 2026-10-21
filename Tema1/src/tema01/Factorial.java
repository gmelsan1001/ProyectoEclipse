package tema01;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact, num;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial");
		num = input.nextInt();
			fact = 1;
	        if (num > 0) {
	            for (int indice = 1; indice <= num; indice++) {
	                fact = fact * indice;
	            }
	        } else {
	            if (num < 0) {
	                System.out.println("Error! No existe el factorial de un número negativo");
	            }
	        }
	        
	        System.out.println(num + "! = " + fact);
	        
	        input.close();
	    }
}