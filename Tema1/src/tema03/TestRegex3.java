package tema03;

public class TestRegex3 {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.validarCodigoPostal(test)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
