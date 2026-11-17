package tema03;

public class testRegex2 {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.validarDni(test)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
