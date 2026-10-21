package tema01;

import java.util.Scanner;

public class Suma_productos_tienda {

	public static void main(String[] args) {
		double precio, precio_total;
        Scanner input = new Scanner(System.in);
		System.out.println("Introduce los precios de los productos. Al introducir 0 se calculará el precio final");
        precio = input.nextDouble();
        
        precio_total = precio;
        
        while (precio > 0) {
            System.out.println("Escribe el precio del siguiente producto");
            precio = input.nextDouble();
            precio_total = precio_total + precio;
        }
        
        System.out.println("El precio total es " + precio_total);
        
        input.close();
    }
}
