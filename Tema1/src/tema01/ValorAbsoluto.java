package tema01;

import java.util.Scanner;

public class ValorAbsoluto {
//	Inicio
//	Definir num Como Entero
//	Escribir "Introduce un número para calcular su valor absoluto"
//	Leer num
//	Si num<0 Entonces
//	num-<num*(-1)
//	FinSi
//        Escribir "El valor absoluto es ", num
//FinAlgoritmo
	public static void main(String[] args) {
//		Escribir "Introduce un número para calcular su valor absoluto"
        System.out.println("Introduce un número para calcular us valor absoluto");		
        Scanner input = new Scanner(System.in);
        input.nextInt();
        int num = input.nextInt();
        input.close();
//    	Si num<0 Entonces
//    	num-<num*(-1)
//    	FinSi
        if (num < 0) {
        	// Distintas maneras de realizar la operación
        	//num *= *-1;
        	//num = -num;
        	//num = -1*num;
        	//mostrando directamente el resultado
        	//System.out.println("El valor absoluto de " + num + " es " + -num);
        	//System.out.println("El valor absoluto de $d es %d\n", num, -num);
        } else {
        	System.out.println("El valor absoluto de " +  num + " es " + num);
        }
	}

}
