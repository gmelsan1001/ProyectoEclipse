package tema03;
/**
 * Clase de utilidades para trabajar con cadenas de texto
 */
public class UtilidadesCadenas {
    /**
     * Devuelve el número de vocales existentes en una cadena de texto
     * @param cadena
     * @return
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
}
