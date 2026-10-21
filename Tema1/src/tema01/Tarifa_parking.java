package tema01;

import java.util.Scanner;

public class Tarifa_parking {

	public static void main(String[] args) {
		int tiempo;
		double importe;
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuántos minutos ha estado el coche en el parking?");
        tiempo = input.nextInt();
        
        if (tiempo < 0) {
            System.out.println("Error. No se puede introducir un tiempo negativo");
        } else {
            if (tiempo <= 30) {
                System.out.println("Importe: 2 euros");
            } else {
                if (tiempo <= 60) {
                    System.out.println("Importe: 3,20 euros");
                } else {
                    importe = 3.2 + ((tiempo - 60) * 0.07);
                    System.out.println("Importe: " + (3.2 + (tiempo - 60) * 0.07));
                }
            }
        }
        
        input.close();
    }
}
