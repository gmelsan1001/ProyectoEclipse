package tema03;
/**
 * Clase de utilidades para trabajar con cadenas de texto
 */
public class UtilidadesCadenas {
    /**
     * Devuelve el número de vocales existentes en una cadena de texto
     * @param cadena
     * @return numVocales
     */
	public static int cuentaVocales (String cadena) {
  	    int numVocales = 0;
  	    String fraseMay = cadena.toUpperCase();
        String patronVocales = "[AEIOUÁÉÍÓÚÜ]";
  	    //for extendido o foreach	
  	  for (char caracter: fraseMay.toCharArray()) {
  		  String letra = String.valueOf(caracter);
  		  if (letra.matches(patronVocales)) {
  			numVocales++;
  		  }
  	  }
    	return numVocales;
    }

	/**
	 * Recibe dos cadenas de texto y devuelve una cadena de texto que es la 
	 * concatenación de las 2 anteriores separadas por un guión
	 * 
	 * @param cad1
	 * @param cad2
	 * @return cadenaConCat, la cadena resultado de concatenar
	 */

    public static String concatenaConGuion (String cad1, String cad2) {
    	String cadenaConCat = cad1 + " - " + cad2;
    	return cadenaConCat;
    }
   
	/**
     * Devuelve verdadero si la cadena cumple el patrón de expresión regular
     * @param cadena,  cualquier cadena
     * @param patron, expresión regular "RegEx"
     * @return cumple
     */
    
    public static boolean testRegex (String cadena, String patron) {
    	boolean cumple = cadena.matches(patron);
    	return cumple;
    }
    
    public static boolean esDigito (String num) {
    	return testRegex(num, "\\d");
    }

    /**
     * 
     * @param nombre
     * @param ap1
     * @param ap2
     * @return
     */
	
    public static String nombreCompletoApellidos (String nombre, String ap1, String ap2) {
    	nombre = nombre.trim().toLowerCase().replace("\\s", "");
    	String nombreCompletoApellidos = nombre + ap1 + ap2;
    	return nombreCompletoApellidos;
    }
}
