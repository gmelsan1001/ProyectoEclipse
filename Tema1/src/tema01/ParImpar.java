package tema01;

import java.util.Scanner;

/**
 * Traducción a Java de el algoritmo par_impar realizado en pseudocódigo
 */
public class ParImpar {
//	Inicio
//		Definir num Como Entero
//		Escribir "Introduce un número para ver si es par o impar"
//		Leer num
//		Si num mod 2 = 0 Entonces
//			Escribir "El número introducido es par"
//		SiNo
//			Escribir "El número introducido es impar"
//		Fin Si
//	FinAlgoritmo
	public static void main(String[] args) {
//		Escribir "Introduce un número para ver si es par o impar"
	    System.out.println("Introduce u número para ver si es par o impar");
//		Definir num Como Entero
//		Leer num
	    Scanner sc= new Scanner(System.in);
	    int numero = sc.nextInt();
	    sc.close();
//		Si num mod 2 = 0 Entonces
//		Escribir "El número introducido es par"
//	SiNo
//		Escribir "El número introducido es impar"
	    if (numero % 2 == 0) {
	    	
	    	System.out.println("El número introducido es par");
	    } else {
	    	
	    	System.out.println("El número introducido en impar");
	    	
	    }
	}

}
