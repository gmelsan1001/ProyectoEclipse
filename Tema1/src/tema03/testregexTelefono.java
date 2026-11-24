package tema03;

public class testregexTelefono {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.testRegexTelefono(test, patron)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
