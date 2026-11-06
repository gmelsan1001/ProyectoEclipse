package tema1Y2.practica;

import java.util.Scanner;

public class Ej1EmpresaMensajeria {

//	Una empresa de mensajería calcula el coste del envío de un paquete según su peso y el destino elegido. 
//	Escribe un programa que pida por teclado el peso del paquete en kilogramos (un valor real) y el destino (1: Península, 2: Baleares o Canarias).
//	Se supone entrada del usuario correcta, no hay que validar los datos de entrada.
//	El precio se calcula según las siguientes reglas:
//	-Península: El precio base es de 5,00 €. Si el paquete pesa más de 5 kg, se cobra un suplemento de 1,50 € por cada kilogramo total, 
//	no se tienen en cuenta las fracciones de kilogramo.
//	-Baleares o Canarias: El precio base es de 9,00 €. Si el paquete pesa más de 5 kg, el suplemento es de 2,50 € por cada kilogramo total.

//	Ejemplo 1:
//	Introduzca el peso del paquete en kg: 3.5
//	Elija el destino (1: Península, 2: Baleares/Canarias): 1
//	El coste total del envío es de 5.00 euros.

//	Ejemplo 2:
//	Introduzca el peso del paquete en kg: 8.2
//	Elija el destino (1: Península, 2: Baleares/Canarias): 2
//	El coste total del envío es de 29.00 euros.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pesopaquete = 0;
		System.out.println("Introduzca el peso del paquete en kg:");
		System.out.print("Elija el destino ->");
		System.out.println("Península\n1 -> Baleares/Canarias\n2");
		int paquete = 0;
		int precio = 0;
		//Precio positivo
		int preciobase1 = 5;
		int preciobase2 = 9;
		//Precio base península: 5,00 €
		//Precio base baleares/canarias: 9,00 €
		int suplemento1 = 150;
		int suplemento2 = 250;
		//Suplemento península (paquete pesa más de 5 kg): 1,50€
		//Suplemento baleares/canarias (paquete pesa más de 5 kg): 2,50 €
		int resultado = pesopaquete * precio;
		if (paquete <= 5) {
			preciobase1 = 5;
			System.out.println("Se cobra un suplemeto de 1,50 € por cada kg total.");
			resultado = pesopaquete * preciobase1 + suplemento1;
		} else {
		    System.out.println("El paquete pesa menos de 5kg, no se cobra el suplemento de 1,50€ por cada kg total.");
			if (paquete <= 5) {
			preciobase2 = 9;
			System.out.println("Se cobra un suplemeto de 2,50 € por cada kg total.");
			resultado = pesopaquete * preciobase2 + suplemento2;
			} else {
			System.out.println("El paquete pesa menos de 5kg, no se cobra el suplemento de 2,50€ por cada kg total.");
		}
			input.close();
	}
	}

}
