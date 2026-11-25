package tema03;

import org.apache.commons.lang3.StringUtils;

public class Ej03Csv {

	//dni;apellidos;nombre;modulo;nota1;nota2;nota3
	//Ejemplo: "12345678Z;López Ruiz;Ana María;Programación;7.5;8.0;9.25"
	//Escribe un programa que, a partir de dicha línea de texto:
	//a) Extraiga individualmente cada uno de los campos haciendo uso del método
	//split(";").
	//b) Calcule la nota media del alumno con dos decimales de precisión.
	//c) Genere y muestre una ficha formateada con String.format() con alineación de
	//columnas.
	//d) Genere una nueva cadena de salida en formato exportable donde los campos
	//aparezcan unidos mediante guiones (" - ") utilizando String.join().
	
	public static void main(String[] args) {
		String lineaCsv = "12345678Z;López Ruiz;Ana María;Programación;7.5;8.0;9.25";
		String[] datos = lineaCsv.split(";");
		// Formato para mostrar los datos
		// Asignatura-Nombre Apellidos-Dni-notaMedia
		//     20           50          9      4    
		float nota1 = Float.parseFloat(datos[4]);
		float nota2 = Float.parseFloat(datos[5]);
		float nota3 = Float.parseFloat(datos[6]);
		float notaMedia = (nota1 + nota2 + nota3) / 3;
		String notaMediaStr = StringUtils.leftPad(String.format("%.2f", notaMedia), 4, " ");
		String asignaturaform = StringUtils.abbreviate(StringUtils.rightPad(datos[3], 20, ""), 20);
		String nombreform = StringUtils.abbreviate(StringUtils.rightPad(datos[2] + " " + datos[1], 50, ""), 50);
		
		String fichaFormateada = String.join("-", asignaturaform, nombreform, datos[0], notaMediaStr);
		System.out.println(fichaFormateada);
	}

}
